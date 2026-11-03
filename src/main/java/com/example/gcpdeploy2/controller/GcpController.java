package com.example.gcpdeploy2.controller;

import com.example.gcpdeploy2.service.GcpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gcp")
public class GcpController {
    private GcpService gcpService;

    public GcpController(GcpService gcpService){
        this.gcpService = gcpService;
    }

    @GetMapping("/intro")
    public String getText(){
        return gcpService.getText();
    }
}

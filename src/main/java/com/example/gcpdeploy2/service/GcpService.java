package com.example.gcpdeploy2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GcpService {

    public String getText(){

        log.info("------------------------Method Running-------------------------");
        return "Hey, This is the 2nd Gcp application I created to deploy";
    }
}

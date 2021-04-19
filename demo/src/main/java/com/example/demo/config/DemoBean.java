package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    @Autowired
    private DemoConfig config;


    public String getDelayInterval() {
        return config.getInterval();
  }


    @Scheduled(fixedDelay = 5000)
    public void hello() {
        System.out.println("Now processing at " + config.getMessage());
    }
}
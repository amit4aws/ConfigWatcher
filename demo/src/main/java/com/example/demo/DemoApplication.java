package com.example.demo;


import com.example.demo.config.RibbonConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;


@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
@AutoConfigureAfter(RibbonConfiguration.class)
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DemoApplication{

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	
   
}

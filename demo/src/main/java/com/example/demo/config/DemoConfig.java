package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
public class DemoConfig {

    private String message = "a message that can be changed live";
    private String interval = "1";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getInterval() {
		return this.interval;
	}

	public void setInterval(String _interval) {
		this.interval = _interval;
	}

}
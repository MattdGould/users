package com.mattg.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
public class UsersApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

    @PostConstruct
    public void startupApplication() {
        LOGGER.info("Started application");
    }

    @PreDestroy
    public void shutdownApplication() {
        LOGGER.info("Application shutting down");
    }
}

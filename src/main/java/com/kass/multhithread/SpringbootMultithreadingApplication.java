package com.kass.multhithread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootMultithreadingApplication {
    public static Logger logger= LoggerFactory.getLogger(SpringbootMultithreadingApplication.class);

    @PostConstruct
    public void getStarted(){
        logger.info(" Application started.....");
    }

    public static void main(String[] args) {
        logger.info(" Application executed.....");
        SpringApplication.run(SpringbootMultithreadingApplication.class, args);
    }

}

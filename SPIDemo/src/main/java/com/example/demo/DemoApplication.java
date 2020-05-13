package com.example.demo;

import com.example.spi.ISpi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ServiceLoader;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        ServiceLoader<ISpi> spis = ServiceLoader.load(ISpi.class);
        for(ISpi iSpi : spis){
            iSpi.invoke();
        }
    }

}

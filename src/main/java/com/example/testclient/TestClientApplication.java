package com.example.testclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestClientApplication {
    @Value("${server.port}")
    private Integer port;


    public static void main(String[] args) {
        SpringApplication.run(TestClientApplication.class, args);
    }

    @GetMapping("/")
    public String mainPath(){
        return "Hello From Backend Server : localhost:"+port;
    }


    @GetMapping("/health")
    public String healthPath(){
        return "UP";
    }




}

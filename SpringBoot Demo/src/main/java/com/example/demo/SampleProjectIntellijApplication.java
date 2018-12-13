package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@SpringBootApplication
public class SampleProjectIntellijApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleProjectIntellijApplication.class, args);
    }
}
*/

//Spring MVC annotationsmvn package

@RestController //stereotype annotation --Spring considers it when handling incoming web requests
@EnableAutoConfiguration
public class SampleProjectIntellijApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleProjectIntellijApplication.class, args);
    }

}
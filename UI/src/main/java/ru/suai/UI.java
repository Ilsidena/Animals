package ru.suai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class UI {
    @RequestMapping("/")
    String sayHello(){
        return "hello, it's an UI!";
    }

    public static void main(String[] args) {
        SpringApplication.run(UI.class, args);
    }
}
package ru.suai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Client {
    @RequestMapping("/")
    String sayHello(){
        return "hello, it's a client!";
    }
    public static void main (String [] args) {
            SpringApplication.run(Client.class, args);
    }
}

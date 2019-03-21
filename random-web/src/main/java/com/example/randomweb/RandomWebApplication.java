package com.example.randomweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class RandomWebApplication {

    private final Random random = new Random();


    public static void main(String[] args) {
        SpringApplication.run(RandomWebApplication.class, args);
    }


    @GetMapping("/random/value")
    public int random() {
        return random.nextInt(5);
    }
}

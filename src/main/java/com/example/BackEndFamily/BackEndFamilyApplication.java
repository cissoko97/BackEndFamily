package com.example.backendfamily;

import com.example.backendfamily.data.entity.User;
import com.example.backendfamily.data.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.backendfamily.data.entity"})
public class BackEndFamilyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndFamilyApplication.class, args);
    }


}


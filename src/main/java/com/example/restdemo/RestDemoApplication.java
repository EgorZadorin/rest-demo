package com.example.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}
}

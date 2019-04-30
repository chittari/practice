package com.naveen.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication


public class SpringBootApp 
{
     public static void main(String[] args) 
     {
         SpringApplication.run(SpringBootApp.class, args);
     }
}

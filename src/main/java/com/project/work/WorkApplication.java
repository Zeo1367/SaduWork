package com.project.work;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* This is the main class of a springBootProject if it is packaged as jar
* You can see this class has main so on deploying this project on the server
* main of this class will run
*
* By SpringBootApplication annotation at the top of the class it scans for other spring annotations
*
* */
@SpringBootApplication
public class WorkApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkApplication.class);
    }
}

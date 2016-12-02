package com.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Felix on 02.12.2016.
 * Package: PACKAGE_NAME
 * Project: DataRun-WaterLevels
 */
@SpringBootApplication
@EnableScheduling
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}

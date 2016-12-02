package com.Config.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Felix on 02.12.2016.
 * Package: PACKAGE_NAME
 * Project: DataRun-WaterLevels
 */
@RestController
public class JSONController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public void greeting(@RequestParam(value="name") String name) {
        System.out.println("TEST");
    }

}

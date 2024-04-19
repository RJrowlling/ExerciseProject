package com.cjy.controller;

import com.cjy.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Author cjy
 * @Date 2024/4/18 9:02
 * @Version 1.0
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${lesson}")
    private String lesson;
    @Value("${enterprise.name}")
    private String name;

    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println(lesson);
        System.out.println(name);
        System.out.println("___________________");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println("___________________");
        System.out.println(enterprise.getName());
        System.out.println(enterprise.getAge());
        System.out.println(enterprise.getTel());
        String[] subject = enterprise.getSubject();
        System.out.println(Arrays.toString(subject));

        return "hello, SpringBoot";
    }
}

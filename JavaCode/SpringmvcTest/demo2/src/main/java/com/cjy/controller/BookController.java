package com.cjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author cjy
 * @Date 2024/4/14 11:02
 * @Version 1.0
 * @Description:
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("book save ...   demo2");
        return "{'info':'springmvc....demo2.....book save'}";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("book delete ...   demo2");
        return "{'info':'springmvc....demo2.....book delete'}";
    }
}

package com.cjy.controller;

import com.cjy.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/14 11:23
 * @Version 1.0
 * @Description:
 */
@Controller
@RequestMapping("/people")
public class PeopleController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam("username") String name, int age) {
        System.out.println("您输入的名字为：" + name+"；您输入的年龄为：" + age);
        return "{'module':'PeopleController'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(User user) {
        System.out.println("pojo参数传递 user ==> "+user);
        return "{'module':'PeopleController'}";
    }

    @RequestMapping("/select")
    @ResponseBody
    public String select(String[] likes) {
        System.out.println(Arrays.toString(likes));
        return "{'module':'PeopleController'}";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestParam List<String> likes) {
        System.out.println(likes.toString());
        return "{'module':'PeopleController'}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("list common(json)参数传递 list ==> "+likes);
        return "{'module':'list common for json param'}";
    }

    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo common(json)参数传递 user ==> "+user);
        return "{'module':'list common for json param'}";
    }

    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        for (User user : list) {
            System.out.println(user);
        }
        return "{'module':'list common for json param'}";
    }

    @RequestMapping("/data")
    @ResponseBody
    public String dataParam(Date date1,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date3) {
        System.out.println("参数传递 date ==> "+date1);
        System.out.println("参数传递 date ==> "+date2);
        System.out.println("参数传递 date ==> "+date3);
        return "{'module':'data param'}";
    }
}

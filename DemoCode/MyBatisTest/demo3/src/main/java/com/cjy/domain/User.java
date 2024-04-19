package com.cjy.domain;

import lombok.Data;

/**
 * @Author cjy
 * @Date 2024/4/19 8:48
 * @Version 1.0
 * @Description:
 */
@Data
public class User {
    private Integer id;   //id（主键）
    private String name;  //姓名
    private Short age;    //年龄
    private Short gender; //性别
    private String phone; //手机号
}

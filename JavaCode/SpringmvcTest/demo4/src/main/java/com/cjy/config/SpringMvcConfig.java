package com.cjy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author cjy
 * @Date 2024/4/14 16:31
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan({"com.cjy.controller","com.cjy.config"})
//开启json数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {
}

package com.cjy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author cjy
 * @Date 2024/4/16 14:59
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan({"com.cjy.controller","com.cjy.config"})
@EnableWebMvc
public class SpringMvcConfig {
}

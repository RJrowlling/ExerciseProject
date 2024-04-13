package com.cjy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author cjy
 * @Date 2024/4/13 13:51
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan("com.cjy")
@EnableAspectJAutoProxy
public class SpringConfig {
}

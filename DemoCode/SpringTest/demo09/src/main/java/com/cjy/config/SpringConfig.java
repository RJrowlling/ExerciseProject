package com.cjy.config;

import org.springframework.context.annotation.*;

/**
 * @Author cjy
 * @Date 2024/4/13 10:18
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan("com.cjy")
@Import(JdbcConfig.class)
@EnableAspectJAutoProxy
public class SpringConfig {

}

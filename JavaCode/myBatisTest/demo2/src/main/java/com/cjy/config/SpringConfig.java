package com.cjy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author cjy
 * @Date 2024/4/16 11:49
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan("com.cjy")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}

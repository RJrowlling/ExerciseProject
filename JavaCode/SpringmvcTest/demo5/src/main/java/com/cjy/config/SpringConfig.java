package com.cjy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author cjy
 * @Date 2024/4/16 14:46
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan("com.cjy.service")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class})
public class SpringConfig {
}

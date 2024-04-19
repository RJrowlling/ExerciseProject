package com.cjy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @Author cjy
 * @Date 2024/4/12 10:41
 * @Version 1.0
 * @Description:
 */
@Configuration
@ComponentScan("com.cjy")
@PropertySource({"jdbc.properties","jdbc2.properties"})
@Import(JdbcConfig.class)
public class SpringConfig {
}

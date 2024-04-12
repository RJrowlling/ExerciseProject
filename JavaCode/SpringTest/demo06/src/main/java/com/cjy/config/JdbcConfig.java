package com.cjy.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.cjy.dao.BookDao;
import com.cjy.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Author cjy
 * @Date 2024/4/12 11:23
 * @Version 1.0
 * @Description:
 */
public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String Url;
    @Value("root")
    private String Username;
    @Value("root")
    private String Password;

    @Bean
    public DataSource dataSource(BookService bookService) {
        System.out.println(bookService);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(Url);
        ds.setUsername(Username);
        ds.setPassword(Password);
        return ds;
    }
}

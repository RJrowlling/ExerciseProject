package com.cjy;

import com.cjy.domain.User;
import com.cjy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.function.Consumer;

@SpringBootTest
class Demo3ApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        List<User> users = userService.getAll();
        users.stream().forEach(user -> System.out.println(user));
    }

}

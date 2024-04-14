package com.cjy.service.impl;

import com.cjy.domain.User;
import com.cjy.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author cjy
 * @Date 2024/4/14 10:01
 * @Version 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        System.out.println("user service ...");
    }
}

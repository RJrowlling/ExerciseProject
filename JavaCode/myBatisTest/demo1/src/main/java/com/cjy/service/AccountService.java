package com.cjy.service;

import com.cjy.domain.Account;

import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/16 11:28
 * @Version 1.0
 * @Description:
 */
public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}

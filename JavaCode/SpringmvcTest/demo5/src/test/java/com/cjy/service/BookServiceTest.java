package com.cjy.service;

import com.cjy.config.SpringConfig;
import com.cjy.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/16 16:25
 * @Version 1.0
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById() {
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }
}

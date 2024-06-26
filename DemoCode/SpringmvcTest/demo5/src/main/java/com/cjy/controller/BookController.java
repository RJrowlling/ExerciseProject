package com.cjy.controller;

import com.cjy.dao.BookDao;
import com.cjy.domain.Book;
import com.cjy.exception.BusinessException;
import com.cjy.exception.SystemException;
import com.cjy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/16 16:09
 * @Version 1.0
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        //模拟业务异常，包装成自定义异常
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "你出现了业务异常，请规范你的操作!");
        }
        //模拟系统异常，将可能出现的异常进行包装，转换成自定义异常
        if (id == 2) {
            try {
                int a = 1 / 0;
            } catch (Exception e) {
                throw new SystemException(Code.SYSTEM_ERR, "你出现了系统异常，请稍后重试", e);
            }
        }


        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "查询失败，请重试";
        return new Result(code, book, msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        Integer code = books != null ? Code.GET_OK : Code.GET_ERR;
        String msg = books != null ? "" : "查询失败，请重试";
        return new Result(code, books, msg);
    }
}

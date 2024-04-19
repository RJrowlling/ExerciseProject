package com.cjy.service;

import com.cjy.domain.Book;

import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/16 16:02
 * @Version 1.0
 * @Description:
 */
public interface BookService {
    /**
     * 新增
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    public List<Book> getAll();
}

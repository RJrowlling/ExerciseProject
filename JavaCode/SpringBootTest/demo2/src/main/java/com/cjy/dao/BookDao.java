package com.cjy.dao;

import com.cjy.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author cjy
 * @Date 2024/4/18 15:23
 * @Version 1.0
 * @Description:
 */
@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}

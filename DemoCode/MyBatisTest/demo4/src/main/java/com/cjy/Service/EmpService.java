package com.cjy.Service;

import com.cjy.domain.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author cjy
 * @Date 2024/4/19 9:44
 * @Version 1.0
 * @Description:
 */
@Mapper
public interface EmpService {

    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    @Select("select * from emp")
    public List<Emp> getAll();

    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);

    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void save(Emp emp);

    @Update("update emp set username=#{username}, name=#{name}, gender=#{gender}, image=#{image}, job=#{job}, entrydate=#{entrydate}, dept_id=#{deptId}, update_time=#{updateTime} where id=#{id}")
    public void update(Emp emp);
}

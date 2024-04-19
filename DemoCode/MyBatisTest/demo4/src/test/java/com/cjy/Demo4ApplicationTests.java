package com.cjy;

import com.cjy.Service.EmpService;
import com.cjy.domain.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class Demo4ApplicationTests {

    @Autowired
    private EmpService empService;

    @Test
    void testDelete() {
        empService.delete(17);
    }

    @Test
    void testGetAll() {
        List<Emp> emps = empService.getAll();
        emps.stream().forEach(emp -> System.out.println(emp));
    }

    @Test
    void testGetById() {
        System.out.println(empService.getById(1));
    }

    @Test
    void testSave() {
        Emp emp = new Emp();
        emp.setUsername("tom");
        emp.setName("汤姆");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empService.save(emp);
    }

    @Test
    void testUpdate() {
        //要修改的员工信息
        Emp emp = new Emp();
        emp.setId(16);
        emp.setUsername("songdaxia");
        emp.setPassword(null);
        emp.setName("老宋");
        emp.setImage("2.jpg");
        emp.setGender((short)1);
        emp.setJob((short)2);
        emp.setEntrydate(LocalDate.of(2012,1,1));
        emp.setCreateTime(null);
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(2);

        empService.update(emp);
    }

}

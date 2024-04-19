package com.cjy;

import com.cjy.domain.Emp;
import com.cjy.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo5ApplicationTests {
    @Autowired
    private EmpService empService;

    @Test
    void testGetAll() {
        List<Emp> emps = empService.getAll();
        emps.stream().forEach(emp -> System.out.println(emp));
    }

}

package com.cjy;

import com.cjy.dao.AccountDao;
import com.cjy.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author cjy
 * @Date 2024/4/16 11:02
 * @Version 1.0
 * @Description:
 */
public class Main {
        public static void main(String[] args) throws IOException {
            // 1. 创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            // 2. 加载SqlMapConfig.xml配置文件
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            // 3. 创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            // 4. 获取SqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession();
            // 5. 执行SqlSession对象执行查询，获取结果User
            AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

            Account ac = accountDao.findById(2);
            System.out.println(ac);

            // 6. 释放资源
            sqlSession.close();
        }

}
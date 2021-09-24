package cn.ean.test;

import cn.ean.dao.UserDao;
import cn.ean.service.UserService;
import junit.runner.BaseTestRunner;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * FileName:TestMybatis
 * Author:ean
 * Date:2021/8/15 2:18 下午
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})

public class TestMybatis {
    private UserDao userDao;

    @Autowired
    private void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Test
    public void testMybatis() {
        System.out.println(userDao.findUser("m0001", "123"));
    }


    @Test
    public void testSpringAppContext() {
        
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
    }
}

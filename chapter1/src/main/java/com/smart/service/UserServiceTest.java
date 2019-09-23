//package com.smart.service;
//
//import com.smart.domain.User;
//import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
//import org.testng.annotations.*;
//import static org.testng.Assert.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//
//@ContextConfiguration(locations = {"applicationContext.xml"})//启动容器
//public class UserServiceTest extends AbstractTestNGSpringContextTests {//基于textNG的测试框架
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void hasMatchUser(){
//        boolean b1 = userService.hasMatchUser("admin", "123456");
//        boolean b2 = userService.hasMatchUser("admin", "1111");
//        assertTrue(b1);
//        assertTrue(!b2);
//    }
//
//    @Test
//    public void findUserByUserName(){
//        User user = userService.findUserByUserName("admin");
//        assertEquals(user.getUserName(),"admin");
//    }
//}

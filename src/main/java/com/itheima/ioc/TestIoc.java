package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.say();
        System.out.println(userDao.add(1, 2));

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.say();
        UserServiceImpl userService1 = (UserServiceImpl)userService;
        System.out.println(userService1.getU());
    }
}

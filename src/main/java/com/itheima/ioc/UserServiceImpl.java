package com.itheima.ioc;

public class UserServiceImpl implements UserService {


    private Integer u;

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setU(Integer u) {
        this.u = u;
    }

    public Integer getU() {
        return u;
    }

    public void say() {
        this.userDao.say();
        System.out.println("userService say Hello World");
    }
}

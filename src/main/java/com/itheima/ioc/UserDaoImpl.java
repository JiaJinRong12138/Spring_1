package com.itheima.ioc;

public class UserDaoImpl implements UserDao {

    public void say() {
        System.out.println("userDao say Hello World");
    }

    public int add(int x, int y) {
        return x + y;
    }
}

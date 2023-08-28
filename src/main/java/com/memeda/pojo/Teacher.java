package com.memeda.pojo;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-21 00:48:16
 */
public class Teacher implements Cloneable{
    public void test() {
        User u = new User();
        u.money = 100;
        System.out.println(u);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

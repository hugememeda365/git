package com.memeda.pojo;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-19 05:47:33
 */
public class VIP extends User {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean addAll() {
        String newName = money.toString() + "vip";
        System.out.println(newName);
        return true;
    }
}

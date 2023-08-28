package com.memeda.pojo;


import lombok.Getter;
import lombok.Setter;

/**
 * @description:
 * @author: hugememeda
 * @date: 2023-08-13 23:11:37
 * @version: 1.0.0
 */

public class User implements Comparable<User> {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    protected Integer money;


    /**
     * @description:
     * @author: hugememeda
     * @date: 2023-12-13 23:08:140

     * @param
     * @return:
     * @throws:
     */
    public void cl() throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.clone();
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.name);
    }

    public void add() {

    }
}

package com.memeda.reflection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-22 23:46:30
 */
public class Good {
    @Setter
    @Getter
    @ToString
    public static class Bad {
        private Integer age;
        private String name;
        private long score;
        public void hello(String name) {
            System.out.println(name);
        }

    }
}

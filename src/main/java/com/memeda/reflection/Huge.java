package com.memeda.reflection;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-22 23:04:20
 */
public class Huge {
    String name;
    Strong strong;
    public Huge(String name, Strong strong) {
        this.name = name;
        this.strong = strong;
    }
    public Huge(String name, TwoInterface twoInterface) {
        this.name = name;

    }

    public void say() {
        strong.beginAgain(name);
    }

    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; ++i) {
            action.run();
        }
    }

}



package com.memeda.reflection;

import com.memeda.pojo.Apple;

import java.util.function.Predicate;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-22 22:00:36
 */
public class Pred implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getAge() < 26;
    }
}

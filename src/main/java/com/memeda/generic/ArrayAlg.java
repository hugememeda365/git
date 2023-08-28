package com.memeda.generic;

import com.sun.istack.internal.NotNull;

import java.util.Map;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-19 04:40:19
 */
public class ArrayAlg {
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
    public static <T extends Comparable<T>> T min(T[] a) {
        if (a == null || a.length == 0)
            return null;
        T smallest = a[0];
        for (int i= 1; i < a.length; ++i) {
            if (smallest.compareTo(a[i]) > 0) smallest = a[i];
        }
        return smallest;
    }
    public static <T extends Comparable<T>> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0)
            return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}

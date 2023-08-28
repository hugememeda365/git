package com.memeda.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-21 23:14:47
 */
@Setter
@Getter
@ToString(callSuper = true)
public class Apple extends Fruit {
    private Integer age;
}

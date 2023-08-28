package com.memeda.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hugememeda
 * @version 1.0.0
 * @date 2023-08-21 23:14:47
 */
@Getter
@Setter
@ToString
public class Fruit extends Food {
    private Integer score = 30;
}

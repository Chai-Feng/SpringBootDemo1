package com.alex.demo1.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title:
 * @Description: TODO
 * @author: Alex
 * @Version:
 * @date 2022-11-29-23:28
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
}

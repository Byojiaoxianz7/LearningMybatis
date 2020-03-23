package com.pojo;

import lombok.Data;

/**
 * @author: Waciao
 * @Date: 2020/3/21
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */

@Data
public class Student {

    private Integer id;
    private String name;


    /**
     * 学生需要关联一个老师
     */
    public Teacher teacher;

}

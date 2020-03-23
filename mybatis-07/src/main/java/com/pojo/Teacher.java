package com.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author: Waciao
 * @Date: 2020/3/21
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */

@Data
public class Teacher {
    private Integer id;
    private String name;

    /**
     * 一个老师拥有多个学生
     */
    private List<Student> student;

}

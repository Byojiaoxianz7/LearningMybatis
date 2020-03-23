package com.dao;

import com.pojo.Student;

import java.util.List;

/**
 * @author: Waciao
 * @Date: 2020/3/21
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public interface StudentMapper {

    /**
     * 嵌套子查询
     * @return
     */
    List<Student> getStudent();

    /**
     * 按照结果嵌套处理
     * @return
     */
    List<Student> getStudent2();

}

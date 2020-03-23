package com.dao;

import com.pojo.Student;
import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: Waciao
 * @Date: 2020/3/21
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public interface TeacherMapper {

    /**
     * 获取老师
     * @return
     */
    // List<Teacher> getTeacher();

    /**
     * 获取指定老师下的所有学生及老师的信息
     * @param id
     * @return
     */
    Teacher getTeacher(@Param("tid") int id);
}

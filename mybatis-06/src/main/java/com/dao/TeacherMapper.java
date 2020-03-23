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
     * 根据id查询老师
     * @param id
     * @return
     */
    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);
}

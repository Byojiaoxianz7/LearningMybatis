package com.waciao.dao;

import com.waciao.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:33
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public interface UserMapper {
    /**
     * 按id获取用户
     * @param id
     * @return
     */
    User getUserById(@Param("id") int id);
}

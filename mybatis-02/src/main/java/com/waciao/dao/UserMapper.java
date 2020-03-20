package com.waciao.dao;

import com.waciao.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:33
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public interface UserMapper {

    /**
     * 增加用户
     * @param user
     * @return
     */
    int addUser(@Param("user") User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(@Param("id") int id);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUser(@Param("user") User user);

    /**
     * 获取所有用户
     * @return
     */
    List<User> getUserList();

    /**
     * 按id获取用户
     * @param id
     * @return
     */
    User getUserById(@Param("id") int id);
}

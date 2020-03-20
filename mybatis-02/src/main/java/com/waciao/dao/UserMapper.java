package com.waciao.dao;

import com.waciao.pojo.User;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:33
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public interface UserMapper {

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    List<User> getUserList();

    User getUserById(int id);
}

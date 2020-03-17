package com.waciao.dao;

import com.waciao.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:33
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public interface UserMapper {

    /**
     * 新增用户
     *
     * @return
     */
    int addUser(User user);

    /**
     * 万能的 map
     *
     * @param map
     * @return
     */
    int addUserMap(HashMap<String, Object> map);


    /**
     * 删除用户
     *
     * @return
     */
    int deleteUser(int id);

    /**
     * 编辑
     *
     * @return
     */
    int updateUser(User user);


    /**
     * 获取所有用户
     *
     * @return
     */
    List<User> getUserList();


    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User getUserById(int id);

}

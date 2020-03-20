package com.waciao.dao;

import com.waciao.pojo.User;
import org.apache.ibatis.annotations.Param;

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
     * 按id获取用户
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 分页查询
     * @param map
     * @return
     */
    List<User> getUserByLimit(Map<String, Integer> map);
}

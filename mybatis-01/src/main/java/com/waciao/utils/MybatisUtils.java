package com.waciao.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:20
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */


// 工具类  sqlSessionFactory --> sqlSession
// 这一段代码属于固定格式, 所以封装成工具类
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            /**
             * 1. 使用mybatis获取sqlSessionFactory对象
             */
            String resource = "mybatis-config.xml"; // resource下的mybatis-config.xml
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2. 从 SqlSessionFactory 中获取 SqlSession
     * 既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
     * SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。
     *
     * @return
     */
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}

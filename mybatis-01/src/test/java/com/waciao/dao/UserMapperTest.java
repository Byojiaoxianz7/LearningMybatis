package com.waciao.dao;

import com.waciao.pojo.User;
import com.waciao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:45
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class UserMapperTest {

    /**
     * 新增用户
     */
    @Test
    public void addUser() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(0, "嘻嘻", "123123")); // id为自增长,填几都无所谓
        if (res > 0) {
            System.out.println("插入成功");
        }

        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 万能的map
     */
    @Test
    public void addUserMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 8);
        map.put("userName", "huo");
        map.put("passWord", "123132");
        int i = mapper.addUserMap(map);
        if (i > 0) {
            System.out.println("新增用户");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 删除用户
     */
    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(2);
        if (i > 0) {
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 编辑用户
     */
    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int updateUser = mapper.updateUser(new User(4, "哈哈", "12123"));
        if (updateUser > 0) {
            System.out.println("更新成功");
        }
        sqlSession.commit();
        sqlSession.close();

    }

    /**
     * 查询所有用户
     */
    @Test
    public void allUserList() {
        // 1. 获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 2. 执行sql
        // 怎么执行?
        // 需要拿到sql(要么从UserMapper里拿,要么从xml里拿,因为是面向接口编程,所以直接从UserMapper拿就行了)
        // 所以get接口就可以拿到了
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // get到接口之后返回,就可以使用接口里的方法了
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        // 3. 关闭sqlSession
        sqlSession.close();

        /**
         * 1. org.apache.ibatis.binding.BindingException: Type interface com.waciao.dao.UserMapper is not known to the MapperRegistry.
         * 执行之后会报错, 没有注册 mapper
         * 需要在mybatis-config.xml里配置
         *
         * 2. java.lang.ExceptionInInitializerError,Caused by: org.apache.ibatis.exceptions.PersistenceException
         * 注册之后还会遇到一个错误
         * 在target/test-classes/com/waciao/dao里没有找到UserMapper.xml
         * 原因在maven中
         * maven由于它的约定大于配置,写文件配置时可能无法被导出或生效
         * maven中配置文件应该放在resources目录,但是这个例子中放在了java目录中,
         * 所以需要在build中配置resources,来防止资源导出失败的问题
         * 解决方案:
         *        在pom.xml文件中引入即可
         *
         * 成功运行^_^
         */

    }

    /**
     * 根据 id 查询用户
     */
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(7);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 模糊查询
     */
    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("%李%");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();

    }


}

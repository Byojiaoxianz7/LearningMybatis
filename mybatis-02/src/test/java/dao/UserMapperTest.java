package dao;

import com.waciao.dao.UserMapper;
import com.waciao.pojo.User;
import com.waciao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:45
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */
public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();

    }

}

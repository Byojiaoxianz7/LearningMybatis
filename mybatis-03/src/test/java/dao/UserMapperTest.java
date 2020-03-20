package dao;

import com.waciao.dao.UserMapper;
import com.waciao.pojo.User;
import com.waciao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();

    }

}

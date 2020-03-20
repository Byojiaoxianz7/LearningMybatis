package dao;

import com.waciao.dao.UserMapper;
import com.waciao.pojo.User;
import com.waciao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
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

    private static Logger logger = Logger.getLogger(UserMapperTest.class);


    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        logger.info(user);
        sqlSession.close();
    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            logger.info(user);
        }
        sqlSession.close();
    }

}

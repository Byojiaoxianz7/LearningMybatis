import com.dao.TeacherMapper;
import com.pojo.Teacher;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: Waciao
 * @Date: 2020/3/23
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class MyTest {

    @Test
    public void getTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}

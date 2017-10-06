package cn.task1.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MybatisUtil {


    public static SqlSession getSqlSession() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        return sqlSessionFactory.openSession();
    }
}

package cn.task1;

import cn.task1.domain.TaskDomain;
import cn.task1.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestDomain {

    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test1() throws IOException {
        TaskDomain taskDomain = (TaskDomain) ac.getBean("taskDomain");
        //////////////////////////////////////
        //////可测试TaskDomain下任意方法/////
        /////////////////////////////////////
        User user = taskDomain.jdbcFindByName("王6");
        System.out.println(user.getUserName()+user.getUserId());


    }

}

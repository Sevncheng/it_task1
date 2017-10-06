package cn.task1.dao;

import cn.task1.Utils.MybatisUtil;
import cn.task1.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MybatiDao {
    @Test
    public void add(User user){
        try {
            SqlSession sqlSession = MybatisUtil.getSqlSession();
            sqlSession.update("test.user.add", user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(User user){
        try {
            SqlSession sqlSession = MybatisUtil.getSqlSession();
            sqlSession.update("test.user.delete", user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void update(User user){
        try {
            SqlSession sqlSession = MybatisUtil.getSqlSession();
            sqlSession.update("test.user.update", user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<User> findAll(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<User> list = sqlSession.selectList("test.user.findAll");
        return list;
    }

    public User findById(int id){
        SqlSession sqlSession = null;
        User user = new User();
        try {
            sqlSession = MybatisUtil.getSqlSession();
            user = sqlSession.selectOne("test.user.findById", id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public User findByName(String name){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        User user = sqlSession.selectOne("test.user.findByName",name);
        return user;
    }
}

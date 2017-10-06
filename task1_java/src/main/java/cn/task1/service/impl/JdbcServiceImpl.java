package cn.task1.service.impl;

import cn.task1.dao.JdbcDao;
import cn.task1.entity.User;
import cn.task1.service.JdbcService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component("jdbcService")
public class JdbcServiceImpl implements JdbcService{
    @Resource
    private JdbcDao jdbcDao;


    @Override
    public void add(User user) {
        jdbcDao.add(user);
    }

    @Override
    public void delete(int id) {
        jdbcDao.delete(id);
    }

    @Override
    public void update(User user) {
        jdbcDao.update(user);
    }

    @Override
    public List<User> findAll() {
        return jdbcDao.findAll();
    }

    @Override
    public User findById(int id) {
        return jdbcDao.findById(id);
    }

    @Override
    public User findByName(String name) {
        return jdbcDao.findByName(name);
    }

}

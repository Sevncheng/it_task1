package cn.task1.service.impl;

import cn.task1.dao.SpringJDBCDao;
import cn.task1.entity.User;
import cn.task1.service.SpringJDBCService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("springJDBCService")
public class SpringJDBCServiceImpl implements SpringJDBCService {
    @Resource
    private SpringJDBCDao springJDBCDao;

    @Override
    public void add(User user) { springJDBCDao.add(user); }

    @Override
    public void delete(int id) {
        springJDBCDao.delete(id);
    }

    @Override
    public void update(User user) {
        springJDBCDao.update(user);
    }

    @Override
    public List<User> findAll() {
        List<User> list = springJDBCDao.findAll();
        return list;
    }

    @Override
    public User findById(int id) {
        return springJDBCDao.findById(id);
    }

    @Override
    public User findByName(String name) {
        return springJDBCDao.findByName(name);
    }

}

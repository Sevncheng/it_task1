package cn.task1.dao;

import cn.task1.entity.User;

import java.util.List;

public interface JdbcDao {
    public void add(User user);
    public void delete(int id);
    public void update(User user);
    public List<User> findAll();
    public User findById(int id);
    public User findByName(String name);
}

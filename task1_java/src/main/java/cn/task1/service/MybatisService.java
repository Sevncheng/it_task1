package cn.task1.service;

import cn.task1.dao.MybatiDao;
import cn.task1.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class MybatisService {
    @Resource
    private MybatiDao mybatiDao;

    public void add(User user){
        mybatiDao.add(user);
    }
    public void delete(User user){
        mybatiDao.delete(user);
    }
    public void update(User user){
        mybatiDao.update(user);
    }
    public List<User> findAll(){
        return mybatiDao.findAll();
    }
    public User findById(int id){ return mybatiDao.findById(id);};
    public User findByName(String name){ return mybatiDao.findByName(name);};

}

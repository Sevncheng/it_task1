package cn.task1.domain;

import cn.task1.entity.User;
import cn.task1.service.JdbcService;
import cn.task1.service.MybatisService;
import cn.task1.service.SpringJDBCService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class TaskDomain {
    @Resource
    private SpringJDBCService springJDBCService;
    Logger log = Logger.getLogger(TaskDomain.class);

    public void  springAdd(User user){
        try {
            springJDBCService.add(user);
        }catch (Exception e){
            log.error("执行SpringAdd方法失败.");
        }
    }

    public void springDelete(int id){
        try{
            springJDBCService.delete(id);
        }catch (Exception e){
            log.error("执行SpringDelete方法失败.");
        }

    }

    public void springUpdate(User user){
        try {
            springJDBCService.update(user);
        }catch (Exception e){
            log.error("执行SpringUpdate方法失败.");
        }
    }

    public List<User> springFindAll(){
        List<User> list = new ArrayList<User>();
        try {
            list = springJDBCService.findAll();
        }catch (Exception e){
            log.error("执行SpringFindAll方法失败.");
        }
        return list;
    }

    public User springFindById(int id){
        User user = new User();
        try {
            user = springJDBCService.findById(id);
        }catch (Exception e){
            log.error("执行SpringFindById方法失败.");
        }
        return  user;
    }

    public User springFindByName(String name){
        User user = new User();
        try {
            user = springJDBCService.findByName(name);
        }catch (Exception e){
            log.error("执行SpringFindByName方法失败.");
        }
        return user;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////
    @Resource
    private MybatisService mybatisService;

    public void  mybatisAdd(User user){
        mybatisService.add(user);
    }

    public void mybatisDelete(User user){
        mybatisService.delete(user);
    }

    public void mybatisUpdate(User user){
        mybatisService.update(user);
    }

    public List<User> mybatisFindAll(){
        return mybatisService.findAll();
    }

    public User mybatisFindById(int id){ return mybatisService.findById(id);}

    public User mybatisFindByName(String name){ return  mybatisService.findByName(name);}

///////////////////////////////////////////////////////////////////////////////////////////////////
    @Resource
    private JdbcService jdbcService;

    public void  jdbcAdd(User user){
        jdbcService.add(user);
    }

    public void jdbcDelete(int id){
        jdbcService.delete(id);
    }

    public void jdbcUpdate(User user){
        jdbcService.update(user);
    }

    public List<User> jdbcFindAll(){
        return jdbcService.findAll();
    }

    public User jdbcFindById(int id){ return jdbcService.findById(id);}

    public User jdbcFindByName(String name){ return  jdbcService.findByName(name);}



}

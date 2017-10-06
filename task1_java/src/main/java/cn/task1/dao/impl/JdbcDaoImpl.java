package cn.task1.dao.impl;

import cn.task1.Utils.JdbcUtils;
import cn.task1.dao.JdbcDao;
import cn.task1.entity.User;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Component("jdbcDao")
public class JdbcDaoImpl implements JdbcDao{

    @Override
    public void add(User user) {
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "insert into task1_user(userId,userName) values(?,?)";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1,user.getUserId());
            p.setString(2,user.getUserName());
            p.executeUpdate();
            JdbcUtils.closeConnection(p,connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "delete from task1_user where userId=?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1,id);
            p.executeUpdate();
            JdbcUtils.closeConnection(p,connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(User user) {
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "update task1_user set userName=? where userId=?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1,user.getUserName());
            p.setInt(2,user.getUserId());
            p.executeUpdate();
            JdbcUtils.closeConnection(p,connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<User>();
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "select userId,userName from task1_user";
            PreparedStatement p = connection.prepareStatement(sql);
            ResultSet resultSet = p.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setUserName(resultSet.getString("userName"));
                list.add(user);
            }
            JdbcUtils.closeConnection(p,connection);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return list;
    }

    @Override
    public User findById(int id) {
        User user = new User();
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "select userId,userName from task1_user where userId=?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1,id);
            ResultSet resultSet = p.executeQuery();
            while (resultSet.next()){
                user.setUserId(resultSet.getInt("userId"));
                user.setUserName(resultSet.getString("userName"));
            }
            JdbcUtils.closeConnection(p,connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User findByName(String name) {
        User user = new User();
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "select userId,userName from task1_user where userName=?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1,name);
            ResultSet resultSet = p.executeQuery();
            while (resultSet.next()){
                user.setUserId(resultSet.getInt("userId"));
                user.setUserName(resultSet.getString("userName"));
            }
            JdbcUtils.closeConnection(p,connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}

package cn.task1.dao.impl;

import cn.task1.dao.SpringJDBCDao;
import cn.task1.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.invoke.MethodHandles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Component("springJDBCDao")
public class SpringJDBCDaoImpl implements SpringJDBCDao {
   @Resource
   private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        try {
            String sql = "insert into task1_user(userId,userName) values(" + user.getUserId() + ",'" + user.getUserName() + "')";
            jdbcTemplate.update(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
       try {
           String sql = "delete from task1_user where userId=?";
           jdbcTemplate.update(sql, id);
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    @Override
    public void update(User user) {
        try {
            String sql = "update task1_user set userName='" + user.getUserName() + "' where userId=" + user.getUserId() + "";
            jdbcTemplate.update(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findAll() {
        List<User> list = null;
        try {
            String sql = "select userId,userName from task1_user";
            list = jdbcTemplate.query(sql, new RowMapper<User>() {
                @Override
                public User mapRow(ResultSet resultSet, int i) throws SQLException {
                    User user = new User();
                    user.setUserId(resultSet.getInt("userId"));
                    user.setUserName(resultSet.getString("userName"));
                    return user;
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public User findById(int id) {
        User user = new User();
        try {
            String sql = "select userId,userName from task1_user where userId=?";
            Map map =jdbcTemplate.queryForMap(sql,id);
            user.setUserId((Integer) map.get("userId"));
            user.setUserName((String) map.get("userName"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User findByName(String name) {
        User user = new User();
        try {
            String sql = "select userId,userName from task1_user where userName=?";
            Map map =jdbcTemplate.queryForMap(sql,name);
            user.setUserId((Integer) map.get("userId"));
            user.setUserName((String) map.get("userName"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}

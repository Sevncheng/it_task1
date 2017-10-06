package cn.task1.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtils {
    public static Connection getConnection() throws Exception{
        String url = "jdbc:mysql://localhost:3306/it_task1";
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url,"root","8866521");
    }

    public  static void closeConnection(PreparedStatement preparedStatement, Connection connection){
        if(preparedStatement!=null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
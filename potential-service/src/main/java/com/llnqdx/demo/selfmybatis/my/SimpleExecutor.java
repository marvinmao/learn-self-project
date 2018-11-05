package com.llnqdx.demo.selfmybatis.my;


import com.example.demo.mybatis.beans.Test;

import java.sql.*;
import java.util.concurrent.Executor;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/9/29
 */
public class SimpleExecutor implements Executor {

    public <E> E query(String sql, Object parameter) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("dbc:postgresql://192.168.2.249:5432/hdsc_db", "postgres", "postgres");
            PreparedStatement preparedStatement = conn.prepareStatement(String.format(sql, Integer.parseInt(String.valueOf(parameter))));
            ResultSet resultSet = preparedStatement.executeQuery();
            Test test = new Test();
            while (resultSet.next()) {
                test.setId(resultSet.getInt(1));
                test.setName(resultSet.getString(2));
            }
            return (E) test;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void execute(Runnable command) {

    }
}

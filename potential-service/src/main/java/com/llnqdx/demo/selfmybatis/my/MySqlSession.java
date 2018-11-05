package com.llnqdx.demo.selfmybatis.my;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/9/29
 */
public class MySqlSession {

    private SimpleExecutor executor = new SimpleExecutor();
    //todo configuration

    public <T> T selectOne(String statement, Object parameter) {

        return executor.query(statement, parameter);
    }
}

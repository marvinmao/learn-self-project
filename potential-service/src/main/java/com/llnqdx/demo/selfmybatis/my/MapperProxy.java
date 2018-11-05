package com.llnqdx.demo.selfmybatis.my;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/9/29
 */
public class MapperProxy<T> implements InvocationHandler {

    private final MySqlSession mySqlSession;
    private final Class<T> mapperInterface;

    public MapperProxy(MySqlSession mySqlSession, Class<T> mapperInterface) {
        this.mySqlSession = mySqlSession;
        this.mapperInterface = mapperInterface;
    }

    //    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().getName().equals(TestMapperXml.nameSpace)) {
            String sql = TestMapperXml.methodSqlMapping.get(method.getName());
            System.out.println(String.format("SQL[%s], parameter[%s]", sql, args[0]));
            return mySqlSession.selectOne(sql, String.valueOf(args[0]));
        }
        return null;
    }
}

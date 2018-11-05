package com.llnqdx.demo.selfmybatis.my;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/9/29
 */
public class TestMapperXml {
    public static final String nameSpace = "com.example.demo.mapper.TestMapper";
    public static final Map<String, String> methodSqlMapping = new HashMap<>();

    static {
        methodSqlMapping.put("selectByPrimaryKey", "select * from test where id = %d");
    }
}

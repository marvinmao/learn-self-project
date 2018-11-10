package com.llnqdx.demo.mapper.mvnproj;

import com.llnqdx.demo.model.mvnproj.ThreadTest;
import com.llnqdx.demo.model.mvnproj.ThreadTestCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThreadTestMapper {
    long countByExample(ThreadTestCriteria example);

    int deleteByExample(ThreadTestCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThreadTest record);

    int insertSelective(ThreadTest record);

    List<ThreadTest> selectByExample(ThreadTestCriteria example);

    ThreadTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThreadTest record, @Param("example") ThreadTestCriteria example);

    int updateByExample(@Param("record") ThreadTest record, @Param("example") ThreadTestCriteria example);

    int updateByPrimaryKeySelective(ThreadTest record);

    int updateByPrimaryKey(ThreadTest record);
}
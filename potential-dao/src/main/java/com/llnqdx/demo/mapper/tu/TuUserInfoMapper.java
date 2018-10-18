package com.llnqdx.demo.mapper.tu;

import com.llnqdx.demo.model.tu.TuUserInfo;
import com.llnqdx.demo.model.tu.TuUserInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TuUserInfoMapper {
    long countByExample(TuUserInfoCriteria example);

    int deleteByExample(TuUserInfoCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(TuUserInfo record);

    int insertSelective(TuUserInfo record);

    List<TuUserInfo> selectByExample(TuUserInfoCriteria example);

    TuUserInfo selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") TuUserInfo record, @Param("example") TuUserInfoCriteria example);

    int updateByExample(@Param("record") TuUserInfo record, @Param("example") TuUserInfoCriteria example);

    int updateByPrimaryKeySelective(TuUserInfo record);

    int updateByPrimaryKey(TuUserInfo record);
}
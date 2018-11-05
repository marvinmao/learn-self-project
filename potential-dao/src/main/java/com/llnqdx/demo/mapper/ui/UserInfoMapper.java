package com.llnqdx.demo.mapper.ui;

import com.llnqdx.demo.model.ui.UserInfo;
import com.llnqdx.demo.model.ui.UserInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    long countByExample(UserInfoCriteria example);

    int deleteByExample(UserInfoCriteria example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoCriteria example);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoCriteria example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoCriteria example);
}
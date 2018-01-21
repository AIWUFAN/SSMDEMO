package com.spring.learn.dao;

import com.spring.learn.model.User;

/**
 * Create by WF on 2018/1/21.<br>
 */
public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


}

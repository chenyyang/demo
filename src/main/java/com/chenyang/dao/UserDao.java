package com.chenyang.dao;

import com.chenyang.module.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by aileenchen on 2017/7/17.
 */
public interface UserDao {
    @Select("select * from user where loginname=#{id}") //以#{}的方式表示sql中的参数
    User getUser(@Param("id")int id);//@param表示上面sql中的参数
}

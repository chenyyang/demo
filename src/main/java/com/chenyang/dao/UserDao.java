package com.chenyang.dao;

import com.chenyang.module.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * Created by aileenchen on 2017/7/17.
 */
public interface UserDao {
    @Select("select * from users where id=#{id} ") //以#{}的方式表示sql中的参数
    User getUser(@Param("id")int id);//@param表示上面sql中的参数

    @Insert("insert into users set name = #{name} ,age=#{age} ") //以#{}的方式表示sql中的参数
    @SelectKey(statement="call identity()", keyProperty="id", before=false, resultType=int.class)
    int addUser(@Param("name")String name,@Param("age")int age);//@param表示上面sql中的参数

    @Select("select * from users ") //以#{}的方式表示sql中的参数
    List<User> getAllUser();//@param表示上面sql中的参数
}

package com.chenyang.services;

import com.chenyang.dao.UserDao;
import com.chenyang.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aileenchen on 2017/7/17.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(int id) {
        return userDao.getUser(id);//调用DB层方法

    }

    public List<User> getAllUsers() {
        return userDao.getAllUser();//调用DB层方法

    }

}

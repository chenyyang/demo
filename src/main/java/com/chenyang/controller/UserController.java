package com.chenyang.controller; /**
 * Created by chenyang on 2017/5/21.
 */

import com.chenyang.dao.UserDao;
import org.json.JSONObject;
import com.chenyang.module.User;
import com.chenyang.services.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);

    @ResponseBody
    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public int test(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        logger.info("name:" + name + ", age:" + age);
        int id = userDao.addUser(name, age);
        logger.info("name:" + name + ", age:" + age + ",id:" + id);
        return id;
    }

    @ResponseBody
    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    public User test(@RequestParam("id") int id) {
        logger.info("id:" + id);
        User user = userService.getUser(id);
        logger.info("user:" + user);
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/user/getall", method = RequestMethod.GET)
    public List<User> getall() {
        List<User> list =  userService.getAllUsers();
        logger.info("getall:" + list);
        return list;
    }

    @RequestMapping(value = "/user/getall2", method = RequestMethod.GET)
    protected String getall2(Model model) {
        List<User> list =  userService.getAllUsers();
        model.addAttribute("list",list);
        return "/user/index";
    }


}

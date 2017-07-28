package com.chenyang.controller; /**
 * Created by chenyang on 2017/5/21.
 */

import com.chenyang.module.User;
import com.chenyang.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public @ResponseBody String test(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return "name:"+name+" , age="+age;
    }

    @RequestMapping(value = "/user/get",method = RequestMethod.GET)
    public @ResponseBody String test(@RequestParam("id") int id) {
        User user = userService.getUser(id);
        if(user == null){
            return "user not exit";
        }
        return user.toString();
    }

}
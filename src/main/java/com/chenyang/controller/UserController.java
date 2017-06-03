package com.chenyang.controller; /**
 * Created by chenyang on 2017/5/21.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public @ResponseBody String test(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return "name:"+name+" , age="+age;
    }

}
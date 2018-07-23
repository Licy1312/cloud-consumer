package com.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 * Author:Jinmu
 * Date: 2018/2/8
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userService.getOneUser(id);
    }

    @RequestMapping(value = "/userId")
    public User getOneUser(@RequestParam Integer id){
        return userService.getOneUser(id);
    }

    @RequestMapping(value = "/name/{name}")
    public String getOneUser(@PathVariable("name") String name){
        return userService.getUserPort(name);
    }
}

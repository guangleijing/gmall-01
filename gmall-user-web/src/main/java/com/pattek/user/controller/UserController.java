package com.pattek.user.controller;


import com.pattek.entity.UserInfo;
import com.pattek.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
    UserService userService;

    @GetMapping("/login")
    @ResponseBody
    public String login(String name, String password) {
        if ("admin".equals(name) && "123456".equals(password)) {
            return "success";
        } else {
            return "fail";
        }
    }

    @GetMapping("/getUsers")
    @ResponseBody
    public List<UserInfo> getAllUsers() {
        return userService.getAllUsers();
    }
}

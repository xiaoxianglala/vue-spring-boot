package com.zjky.server.controller;

import com.zjky.server.entity.ResultJson;
import com.zjky.server.entity.User;
import com.zjky.server.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author ysy
 * @Date 2020/4/7 15:50
 **/
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public ResultJson login(@RequestBody User user){
        List<User> users = userService.queryUserList(user);
        String userName = user.getUserName();
        userName = HtmlUtils.htmlEscape(userName);
        if (!"xiaoxiang".equals(userName) || !"123456".equals(user.getPassword())) {
            return  ResultJson.failure();
        }else {
            return ResultJson.success();
        }
    }
}

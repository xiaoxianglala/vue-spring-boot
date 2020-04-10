package com.zjky.server.service.user.impl;

import com.zjky.server.entity.User;
import com.zjky.server.mapper.user.UserMapper;
import com.zjky.server.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author ysy
 * @Date 2020/4/7 18:23
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserList(User user) {
        return null;
    }
}

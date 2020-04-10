package com.zjky.server.service.user;

import com.zjky.server.entity.User;

import java.util.List;

/**
 * @InterfaceName UserService
 * @Description TODO
 * @Author ysy
 * @Date 2020/4/7 18:13
 **/
public interface UserService {

    /**
     * @Author ysy
     * @Description 获得用户信息
     * @Date 2020/4/7 18:21
     * @Param [user]
     * @return java.util.List<com.zjky.server.entity.User>
     **/
    List<User> queryUserList(User user);
}

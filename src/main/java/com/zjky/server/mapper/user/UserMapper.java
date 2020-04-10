package com.zjky.server.mapper.user;

import com.zjky.server.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @InterfaceName UserMapper
 * @Description TODO
 * @Author ysy
 * @Date 2020/4/7 17:45
 **/
@Mapper
public interface UserMapper {
    List<User> queryUserList(@Param("user") User user);
}

package com.zjky.server.entity;

import lombok.Data;
import lombok.NonNull;

/**
 * @ClassName User
 * @Description TODO
 * @Author ysy
 * @Date 2020/4/7 15:52
 **/
@Data
public class User {
    //主键
    private String id;
    //用户名
    private String userName;
    //密码
    private String password;
    //电话
    private String phone;
    //用户头像
    private String headPortrait;

/*    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }*/
}

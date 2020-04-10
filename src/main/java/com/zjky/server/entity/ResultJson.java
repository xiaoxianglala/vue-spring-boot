package com.zjky.server.entity;

import java.io.Serializable;

/**
 * @ClassName ResultJson
 * @Description 请求返回数据对象
 * @Author ysy
 * @Date 2020/4/7 15:20
 **/
public class ResultJson implements Serializable {

    public static final String PARAMETER_ERROR = "100";
    public static final String MSG_PARAMETER_ERROR = "入参错误";

    public static final String MISSING_PARAMETER = "101";
    public static final String MSG_MISSING_PARAMETER = "缺少入参";

    public static final String NOT_LOGIN = "201";
    public static final String MSG_NOT_LOGIN = "未登录";

    public static final String SESSION_TIME_OUT = "401";
    public static final String MSG_SESSION_TIME_OUT = "登录超时";


    public static final String LOGIN_STATUS_ERROR = "203";
    public static final String MSG_LOGIN_STATUS_ERROR = "登录态错误";

    public static final String SERVICE_ERROR = "300";
    public static final String MSG_SERVICE_ERROR = "服务器错误";

    public static final String INTERFACE_NOT_AUTH = "403";
    public static final String MSG_INTERFACE_NOT_AUTH = "接口未授权";


    public static final String REQUEST_SUCCESS = "501";
    public static final String MSG_REQUEST_SUCCESS = "请求成功！";

    public static final String REQUEST_FAILURE = "502";
    public static final String MSG_REQUEST_FAILURE = "请求失败！";

    //返回状态码
    private String code;

    //返回信息
    private String msg;

    //返回数据
    private Object data;

    //操作行为
    private String behavior;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    /**
     * @Author ysy
     * @Description 返回数据是否正确
     * @Date 2020/4/7 15:33 
     * @Param []
     * @return java.lang.Boolean
     **/
    public Boolean isTrue(){
        Boolean flag = false;
        if (REQUEST_SUCCESS.equals(getCode())) {
            flag = true;
        }
        return flag;
    }

    /**
     * @Author ysy
     * @Description 参数错误
     * @Date 2020/4/7 15:34 
     * @Param []
     * @return com.zjky.server.entity.ResultJson
     **/
    public static ResultJson paramError(){
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(PARAMETER_ERROR);
        resultJson.setMsg(MSG_PARAMETER_ERROR);
        return resultJson;
    }


    /**
     * @Author ysy
     * @Description 未登录
     * @Date 2020/4/7 15:36
     * @Param []
     * @return com.zjky.server.entity.ResultJson
     **/
    public static ResultJson notLogin(){
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(NOT_LOGIN);
        resultJson.setCode(MSG_NOT_LOGIN);
        return resultJson;
    }

    /**
     * @Author ysy
     * @Description 登录状态错误
     * @Date 2020/4/7 15:36 
     * @Param []
     * @return com.zjky.server.entity.ResultJson
     **/
    public static ResultJson loginStatuError() {
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(LOGIN_STATUS_ERROR);
        resultJson.setMsg(MSG_LOGIN_STATUS_ERROR);
        return resultJson;
    }

    /**
     * @Author ysy
     * @Description 未授权
     * @Date 2020/4/7 15:37 
     * @Param []
     * @return com.zjky.server.entity.ResultJson
     **/
    public static ResultJson unauthorized() {
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(INTERFACE_NOT_AUTH);
        resultJson.setMsg(MSG_INTERFACE_NOT_AUTH);
        return resultJson;
    }

    /**
     * @Author ysy
     * @Description 服务器错误
     * @Date 2020/4/7 15:37 
     * @Param []
     * @return com.zjky.server.entity.ResultJson
     **/
    public static ResultJson serviceError() {
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(SERVICE_ERROR);
        resultJson.setMsg(MSG_SERVICE_ERROR);
        return resultJson;
    }

    /**
     * @Author ysy
     * @Description 请求失败
     * @Date 2020/4/7 15:37 
     * @Param []
     * @return com.zjky.server.entity.ResultJson
     **/
    public static ResultJson failure() {
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(REQUEST_FAILURE);
        resultJson.setMsg(MSG_REQUEST_FAILURE);
        return resultJson;
    }
    
    /**
     * @Author ysy
     * @Description 请求成功
     * @Date 2020/4/7 15:38 
     * @Param []
     * @return com.zjky.server.entity.ResultJson
     **/
    public static ResultJson success() {
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(REQUEST_SUCCESS);
        resultJson.setMsg(MSG_REQUEST_SUCCESS);
        return resultJson;
    }

    /**
     * @Author ysy
     * @Description 登录超时
     * @Date 2020/4/7 15:50
     * @Param []
     * @return com.zjky.server.entity.ResultJson
     **/
    public static ResultJson logionTimeOut() {
        ResultJson resultJson = new ResultJson();
        resultJson.setCode(SESSION_TIME_OUT);
        resultJson.setMsg(MSG_SESSION_TIME_OUT);
        return resultJson;
    }
}

package com.zyq.pojo;

import lombok.Data;

/**
 * @author 邹雨樵
 * @date 2019/7/18
 * @since 1.0.0
 */
@Data
public class User {

    /**
     * id编号
     */
    private int id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String passWord;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 大头像
     */
    private String bigHead;

    /**
     * 飞吻
     */
    private String kiss;

    /**
     * 性别
     */
    private String sex;

    /**
     * 认证信息
     */
    private String message;

    /**
     * vip
     */
    private String vip;

    /**
     * 签名
     */
    private String signature;

    /**
     * 住址
     */
    private String address;

    /**
     * 创建时间
     */
    private String time;

    /**
     * 小头像
     */
    private String smallHead;


}
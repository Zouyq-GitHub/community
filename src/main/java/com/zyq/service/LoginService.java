package com.zyq.service;

import com.zyq.pojo.User;

/**
 * @author admin
 * @date 2019-07-22 12:31
 */
public interface LoginService {

    /**
     * 登录方法
     * @param loginName 登录名
     * @param passWord 密码
     * @return 返回对象
     */
    User login(String loginName, String passWord);
}

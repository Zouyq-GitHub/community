package com.zyq.service.impl;

import com.zyq.mapper.LoginMapper;
import com.zyq.pojo.User;
import com.zyq.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 邹雨樵
 * @date 2019/7/22
 * @since 1.0.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    private final LoginMapper loginMapper;

    @Autowired
    public LoginServiceImpl(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    /**
     * 登录方法
     *
     * @param loginName 登录名
     * @param passWord  密码
     * @return 返回对象
     */
    public User login(String loginName, String passWord) {
        return loginMapper.login(loginName, passWord);
    }
}
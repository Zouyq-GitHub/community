package com.zyq.mapper;

import com.zyq.mapper.LoginMapper;
import com.zyq.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 邹雨樵
 * @date 2019/7/22
 * @since 1.0.0
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dao.xml")
public class LoginTest {

    private  LoginMapper loginMapper;



    @Test
    public void login() {
        String loginName = "rm";
        String passWord = "1";
        User user = loginMapper.login(loginName, passWord);
        System.out.println(user);
    }

}
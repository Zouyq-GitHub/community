package com.zyq.service.impl;

import com.zyq.mapper.UserMapper;
import com.zyq.pojo.Answer;
import com.zyq.pojo.Quiz;
import com.zyq.pojo.User;
import com.zyq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 邹雨樵
 * @date 2019/7/23
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    /**
     * 根据id查询信息
     *
     * @param id 用户id
     * @return 查询信息
     */
    @Override
    public User adminById(String id) {
        return userMapper.adminById(id);
    }

    /**
     * 根据用户ID查询所提问的帖子
     *
     * @param id 用户ID
     * @return 返回集合
     */
    @Override
    public List<Quiz> queryInvitation(int id) {
        return userMapper.queryInvitation(id);
    }

    /**
     * 查询用户回答的帖子
     *
     * @param id 用户id
     * @return 返回集合
     */
    @Override
    public List<Answer> queryAnswer(int id) {
        return userMapper.queryAnswer(id);
    }
}
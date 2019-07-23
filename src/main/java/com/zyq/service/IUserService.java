package com.zyq.service;

import com.zyq.pojo.Answer;
import com.zyq.pojo.Quiz;
import com.zyq.pojo.User;

import java.util.List;

/**
 * @author admin
 * @date 2019-07-23 09:27
 */
public interface IUserService {

    /**
     * 根据id查询信息
     * @param id 用户id
     * @return 查询信息
     */
    User adminById(String id);

    /**
     * 根据用户ID查询所提问的帖子
     * @param id 用户ID
     * @return 返回集合
     */
    List<Quiz> queryInvitation(int id);

    /**
     * 查询用户回答的帖子
     * @param id 用户id
     * @return 返回集合
     */
    List<Answer> queryAnswer(int id);

}

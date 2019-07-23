package com.zyq.mapper;

import com.zyq.pojo.Answer;
import com.zyq.pojo.Invitation;
import com.zyq.pojo.Quiz;
import com.zyq.pojo.User;

import java.util.List;

/**
 * @author admin
 * @date 2019-07-23 09:32
 */
public interface UserMapper {

    /**
     * 用户id查询
     * @param id id
     * @return 对象
     */
    User adminById(String id);

    /**
     * 根据用户ID查询所匹配的帖子
     * @param id 用户ID
     * @return 返回集合
     */
    List<Quiz> queryInvitation(int id);

    /**
     * 根据用户id查询回复的帖子
     * @param id 用户ID
     * @return 返回集合
     */
    List<Answer> queryAnswer(int id);
}

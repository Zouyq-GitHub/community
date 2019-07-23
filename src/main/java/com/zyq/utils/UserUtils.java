/*
package com.zyq.utils;

import com.zyq.pojo.Answer;
import com.zyq.pojo.Quiz;
import com.zyq.pojo.User;
import com.zyq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.List;

*/
/**
 * 用户工具类
 *
 * @author 邹雨樵
 * @date 2019/7/23
 * @since 1.0.0
 *//*


public class UserUtils {

    private IUserService userService;
    private User user = new User();


    */
/**
     * 根据用户 查询出用户回答及用户提问
     *//*

    public void answerAndQuiz(Model model) {
        //根据用户ID查询提问的帖子
        List<Quiz> userInvitationList = userService.queryInvitation(user.getId());
        model.addAttribute("userInvitationList", userInvitationList);
        //查询用户的回答
        List<Answer> answerList = userService.queryAnswer(user.getId());
        model.addAttribute("answerList", answerList);
    }
}*/

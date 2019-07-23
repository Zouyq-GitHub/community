package com.zyq.controller;

import com.zyq.pojo.Answer;
import com.zyq.pojo.Invitation;
import com.zyq.pojo.Quiz;
import com.zyq.pojo.User;
import com.zyq.service.IUserService;
import com.zyq.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author 邹雨樵
 * @date 2019/7/18
 * @since 1.0.0
 */
@Controller
public class CommunityController {


    private final LoginService loginService;
    private final IUserService userService;


    @Autowired
    public CommunityController(LoginService loginService, IUserService userService) {
        this.loginService = loginService;
        this.userService = userService;
    }

    /**
     * 登录方法
     *
     * @param loginName 登录账号
     * @param passWord  登录密码
     * @return 返回主页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String loginName, String passWord, Model model) {
        User user = loginService.login(loginName, passWord);
        if (user != null) {
            model.addAttribute("user", user);
            //根据用户ID查询提问的帖子
            List<Quiz> userInvitationList = userService.queryInvitation(user.getId());
            model.addAttribute("userInvitationList", userInvitationList);
            //查询用户的回答
            List<Answer> answerList = userService.queryAnswer(user.getId());
            model.addAttribute("answerList", answerList);
            return "/ui/html/user/home";
        }
        return "login";
    }


    /**
     * 回跳个人中心解决丢失数据问题
     *
     * @param id 用户id
     * @return 返回对象
     */
    @RequestMapping(value = "/adminById", method = RequestMethod.GET)
    public String adminById(String id, Model model) {
        User user = userService.adminById(id);
        model.addAttribute("user", user);
        if (user != null) {
            model.addAttribute("user", user);
            //根据用户ID查询提问的帖子
            List<Quiz> userInvitationList = userService.queryInvitation(user.getId());
            model.addAttribute("userInvitationList", userInvitationList);
            //查询用户的回答
            List<Answer> answerList = userService.queryAnswer(user.getId());
            model.addAttribute("answerList", answerList);
            return "/ui/html/user/home";
        }
        return "login";
    }

    /**
     * 查询主页帖子信息
     *
     * @return 返回集合
     */
    @RequestMapping(value = "/queryHome", method = RequestMethod.GET)
    public String queryHome(String id, Model model) {


        return "";
    }
}
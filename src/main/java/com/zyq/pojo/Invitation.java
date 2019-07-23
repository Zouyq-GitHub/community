package com.zyq.pojo;

import lombok.Data;

/**
 * 帖子
 * @author 邹雨樵
 * @date 2019/7/23
 * @since 1.0.0
 */
@Data
public class Invitation {

    /**
     *  id
     */
    private int id;

    /**
     * 我的提问
     */
    private String query;

    /**
     * 我的回答
     */
    private String answer;

    /**
     * 我的帖子
     */
    private String invitation;

    /**
     * 我的分享
     */
    private String share;

    /**
     * 用户ID
     */
    private User user;
}
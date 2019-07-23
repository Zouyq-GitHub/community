package com.zyq.pojo;

import lombok.Data;

/**
 * 用户的回答
 *
 * @author 邹雨樵
 * @date 2019/7/23
 * @since 1.0.0
 */
@Data
public class Answer {

    /**
     * 回答id
     */
    private String id;

    /**
     * 回答内容
     */
    private String answer;

    /**
     * 问题编号
     */
    private String quiz;

    /**
     * 用户id
     */
    private User user;

    /**
     * 回答时间
     */
    private String time;
}
package com.zyq.pojo;

import lombok.Data;

/**
 * 我的提问
 *
 * @author 邹雨樵
 * @date 2019/7/23
 * @since 1.0.0
 */
@Data
public class Quiz {

    /**
     * 提问id
     */
    private int id;

    /**
     * 提问
     */
    private String quiz;

    /**
     * 提问时间
     */
    private String time;

    /**
     * 查看人数
     */
    private String look;

    /**
     * 回答数
     */
    private String answer;

    /**
     * 用户
     */
    private User user;


}
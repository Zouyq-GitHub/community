package com.zyq.mapper;

import com.zyq.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author admin
 * @date 2019-07-18 17:15
 */
public interface LoginMapper {
    /**
     * 登录方法 查询返回对象
     * @param loginName  用户名
     * @param passWord 密码
     * @return 返回对象
     */
    User login(@Param("loginName") String loginName, @Param("passWord") String passWord);
}

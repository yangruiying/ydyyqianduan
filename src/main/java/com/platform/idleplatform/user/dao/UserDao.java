package com.platform.idleplatform.user.dao;

import com.platform.idleplatform.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    public UserInfo getUserInfo(String userId);
}

package com.platform.idleplatform.login.service;

import com.platform.idleplatform.login.dao.LoginDao;
import com.platform.idleplatform.login.entity.LoginInfo;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {
    @Resource
    private LoginDao loginDao;

    public AppResponse login(LoginInfo loginInfo){
        return AppResponse.success("查询成功" , loginDao.login(loginInfo));
    }


}

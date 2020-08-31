package com.platform.idleplatform.login.controller;

import com.platform.idleplatform.login.entity.LoginInfo;
import com.platform.idleplatform.login.service.LoginService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("auth")
@CrossOrigin
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping("form")
    private AppResponse login(LoginInfo loginInfo){
        return loginService.login(loginInfo);
    }
}

package net.evercodig.helloblog.controller;

import net.evercodig.helloblog.pojo.UserVO;
import net.evercodig.helloblog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 登录 先查询 后比对
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(method = RequestMethod.POST)
    public String login(@RequestBody UserVO userVO){
        String result = loginService.compare(userVO);
        return result;
    }
}

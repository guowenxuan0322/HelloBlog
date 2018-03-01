package net.evercodig.helloblog.controller;

import net.evercodig.helloblog.pojo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.evercodig.helloblog.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService Uservice;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@RequestBody UserVO userVO){
        String result = Uservice.userSave(userVO);
        return result;
    }

    @RequestMapping(value = "/update/{id}" ,method = RequestMethod.PUT)
    public String updateUser(@PathVariable Integer id, @RequestBody UserVO userVO){
        String result = Uservice.userUpdate(userVO);
        return result;
    }
}

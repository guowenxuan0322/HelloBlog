package net.evercodig.helloblog.controller;

import net.evercodig.helloblog.pojo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.evercodig.helloblog.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService UserService;

    @RequestMapping(method = RequestMethod.POST)
    public String saveUser(@RequestBody UserVO userVO){
        String result = UserService.userSave(userVO);
        return result;
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public String updateUser(@PathVariable Integer id, @RequestBody UserVO userVO){
        String result = UserService.userUpdate(userVO);
        return result;
    }
}

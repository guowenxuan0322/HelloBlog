package net.evercodig.helloblog.service;

import net.evercodig.helloblog.pojo.UserVO;

public interface UserService {
    String userSave(UserVO userVO);

    String userUpdate(UserVO userVO);
}


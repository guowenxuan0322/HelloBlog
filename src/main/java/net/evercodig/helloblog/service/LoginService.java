package net.evercodig.helloblog.service;

import net.evercodig.helloblog.pojo.UserVO;

public interface LoginService {
    String compare(UserVO userVO);
}

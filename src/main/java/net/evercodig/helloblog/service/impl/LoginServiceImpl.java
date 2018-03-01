package net.evercodig.helloblog.service.impl;

import net.evercodig.helloblog.common.MD5Util;
import net.evercodig.helloblog.dao.LoginDao;
import net.evercodig.helloblog.pojo.User;
import net.evercodig.helloblog.pojo.UserVO;
import net.evercodig.helloblog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.evercodig.helloblog.common.LoginState;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;

    @Override
    public String compare(UserVO userVO) {
        User user = new User();
        user.setUsername(userVO.getUsername());
        try{
            User findUser = loginDao.findUserByName(userVO.getUsername());
            String password = userVO.getPassword();
            password = MD5Util.generate(password);
            String findPassword = findUser.getPassword();
            if (password.equals(findPassword)) {
                return LoginState.Succed.name();
            }else{
                return LoginState.Fail.name();
            }
        }catch (Exception e){
            return LoginState.Error.name();
        }
    }
}

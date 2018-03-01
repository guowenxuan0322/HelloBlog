package net.evercodig.helloblog.service.impl;

import net.evercodig.helloblog.common.MD5;
import net.evercodig.helloblog.dao.LoginDao;
import net.evercodig.helloblog.pojo.User;
import net.evercodig.helloblog.pojo.UserVO;
import net.evercodig.helloblog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
            User findUser = loginDao.findUserByName(user);
            String password = userVO.getPassword();
            password = MD5.getMD5(password);
            String findPassword = findUser.getPassword();
            System.out.println("password=="+password);
            System.out.println("findPassword=="+findPassword);
            if (password.equals(findPassword)) {
                return "登录成功";
            }else{
                return "登录失败,密码错误";
            }
        }catch (Exception e){
            return "用户名错误";
        }
    }
}

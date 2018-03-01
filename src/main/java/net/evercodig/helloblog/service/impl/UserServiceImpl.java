package net.evercodig.helloblog.service.impl;


import net.evercodig.helloblog.common.MD5;
import net.evercodig.helloblog.dao.UserDao;
import net.evercodig.helloblog.pojo.User;
import net.evercodig.helloblog.pojo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.evercodig.helloblog.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public String userSave(UserVO userVO){
        String password = userVO.getPassword();
        password = MD5.getMD5(password);
        User user = new User();
        user.setUsername(userVO.getUsername());
        user.setPassword(password);
        user.setInintime(System.currentTimeMillis());
        user.setChangetime(System.currentTimeMillis());
        int i = userDao.insert(user);
        String result;
        if(i != 0){
            result = "保存成功";
        }else{
            result = "保存失败";
        }
        return result;
    }

    @Override
    public String userUpdate(UserVO userVO) {
        String password = userVO.getPassword();
        password = MD5.getMD5(password);
        User user = new User();
        user.setId(userVO.getId());
        user.setUsername(userVO.getUsername());
        user.setPassword(password);
        user.setChangetime(System.currentTimeMillis());
        int i = userDao.updateByPrimaryKeySelective(user);
        String result;
        if(i != 0){
            result = "保存成功";
        }else{
            result = "保存失败";
        }
        return result;
    }
}

package cn.ean.service.impl;

import cn.ean.dao.UserDao;
import cn.ean.pojo.User;
import cn.ean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FileName:UserServiceImpl
 * Author:ean
 * Date:2021/8/5 11:04 下午
 **/
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Autowired
    private void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public User findUser(String usercode, String password) {
        User user = userDao.findUser(usercode, password);
        return user;
    }
}















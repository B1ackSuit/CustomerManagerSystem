package cn.ean.dao;

import cn.ean.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * FileName:UserDao
 * Author:ean
 * Date:2021/8/5 6:22 下午
 **/
public interface UserDao {
    /*
    账号和密码查询用户
     */
    User findUser(@Param("usercode") String usercode,
                         @Param("password") String password);

}





















package com.dubbo.provider.bak.user;

import com.dubbo.base.user.User;
import com.dubbo.base.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public User getUser() {
        User user = new User("邱玮2", "18");
        return user;
    }
}

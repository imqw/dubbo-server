package com.dubbo.consumer.two.user;



import com.dubbo.base.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@RequestMapping
@RestController
public class UserController {


    @Autowired
    @SuppressWarnings("all")
    UserService userService;

    @GetMapping("user")
    public String getUser() {

        return userService.getUser().toString();
    }

}

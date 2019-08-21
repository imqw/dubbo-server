package com.dubbo.base.user;

import java.io.Serializable;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = -974838150403042298L;

    private String name;

    private String age;


    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

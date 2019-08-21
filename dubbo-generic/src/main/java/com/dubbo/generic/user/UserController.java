package com.dubbo.generic.user;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@RestController
@RequestMapping
public class UserController {

    @GetMapping("generic")
    public String getGeneric(){


        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubboConsumer");

        RegistryConfig registryConfig = new RegistryConfig();

        registryConfig.setAddress("localhost:2181");
        registryConfig.setProtocol("zookeeper");

        ReferenceConfig<GenericService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setVersion("localhost");
        referenceConfig.setGroup("group-one");


        referenceConfig.setInterface("com.dubbo.base.user.service.UserService");

        //泛化配置
        referenceConfig.setGeneric(true);
        GenericService genericService = referenceConfig.get();

//        Object result = genericService.$invoke("getPermissions", new String[]{"java.lang.Long"}, new Object[]{1L});

        Object result = genericService.$invoke("getUser", new String[]{}, new Object[]{});


        return result.toString();
    }

}

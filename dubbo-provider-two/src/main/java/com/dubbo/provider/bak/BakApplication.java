package com.dubbo.provider.bak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:dubbo/dubbo-provider.xml"})
@SpringBootApplication
public class BakApplication {

    public static void main(String[] args) {
        SpringApplication.run(BakApplication.class, args);
    }

}

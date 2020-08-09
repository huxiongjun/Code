package com.hu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author huxiongjun
 *
 * 服务的启动类
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        // run 方法会直接启动该服务,返回一个容器对象
        ConfigurableApplicationContext applicationContext = SpringApplication.run(EurekaServerApplication.class, args);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    }
}

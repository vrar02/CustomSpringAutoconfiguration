package com.vivek.helloserviceautoconfigure.config;

import com.vivek.service.HelloService;
import com.vivek.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {

    @Value("${my_data_param:400}")
    String dataParam;

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){

        HelloServiceImpl helloService= new HelloServiceImpl();
        helloService.setParam(dataParam);
        return  helloService;
    }
}

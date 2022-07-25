package com.duing;

import com.duing.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@EnableConfigurationProperties(FoodConfig.class)
//可以在入口类添加上面注解，也可以在配置类上添加@Component

public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }


}

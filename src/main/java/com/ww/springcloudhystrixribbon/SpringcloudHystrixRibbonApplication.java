package com.ww.springcloudhystrixribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudHystrixRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixRibbonApplication.class, args);
    }

}

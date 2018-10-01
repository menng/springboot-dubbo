package org.aaron.springboot.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * created by Menng on 2018/9/30 16:30
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "org.aaron.springboot.dubbo.consumber")
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}

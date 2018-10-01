package org.aaron.springboot.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * created by Menng on 2018/9/30 16:30
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "org.aaron.springboot.dubbo.provider")
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}

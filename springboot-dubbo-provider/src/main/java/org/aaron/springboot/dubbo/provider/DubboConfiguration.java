package org.aaron.springboot.dubbo.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Dubbo配置
 * created by Menng on 2018/9/30 16:30
 */
@Configuration
public class DubboConfiguration {

    @Value("${zookeeper.address}")
    private String zkAddress;

    @Value("${dubbo.port}")
    private Integer dubboPort;

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://" + zkAddress);
        registryConfig.setClient("curator");
        return registryConfig;
    }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("sprintboot-dubbo-provider");
        return applicationConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(dubboPort);
        protocolConfig.setName("dubbo");
        return protocolConfig;
    }
}

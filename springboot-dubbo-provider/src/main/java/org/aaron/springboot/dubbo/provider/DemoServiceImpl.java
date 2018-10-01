package org.aaron.springboot.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.aaron.springboot.dubbo.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * created by Menng on 2018/9/30 14:55
 */
@Component
@Service(interfaceClass = DemoService.class, version = "1.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "Hello Springboot Dubbo";
    }
}

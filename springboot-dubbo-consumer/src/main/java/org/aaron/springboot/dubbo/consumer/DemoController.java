package org.aaron.springboot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.aaron.springboot.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Menng on 2018/9/30 16:18
 */
@RestController
public class DemoController {

    @Reference(interfaceClass = DemoService.class, version = "1.0")
    private DemoService demoService;

    @RequestMapping("/hello")
    public String sayHello() {
        return demoService.sayHello();
    }
}

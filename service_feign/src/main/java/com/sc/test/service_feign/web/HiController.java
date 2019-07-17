package com.sc.test.service_feign.web;

import com.sc.test.service_feign.clients.ScheduleEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    ScheduleEurekaClient scheduleEurekaClient;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return scheduleEurekaClient.sayHiFromClientOne(name);
    }

}

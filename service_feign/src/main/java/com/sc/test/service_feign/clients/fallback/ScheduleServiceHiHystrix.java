package com.sc.test.service_feign.clients.fallback;

import com.sc.test.service_feign.clients.ScheduleEurekaClient;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHiHystrix implements ScheduleEurekaClient {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}

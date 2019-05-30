package com.zy.servicefeign.hystric;

import com.zy.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sqyHiFromClintOne(String name) {
        return "sorry ," + name;
    }
}

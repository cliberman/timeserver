package com.example.timeserver.service;

import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class TimeService {
    public String getTime() {
        Date date = new Date();
        return date.toString();
    }

    public Long getEpochTime() {
        Date date = new Date();
        
        return date.getTime();
    }
}

package com.example.timeserver.service;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.time.*;
import java.util.TimeZone;

@Service
public class TimeService {

//    public String getTime() {
//        Date date = new Date();
//        return date.toString();
//    }

    public String getTime() {   //gets time in utc
        Instant utcTime = Instant.now();
        String finalTime = utcTime.toString();
        System.out.println("UTC time: " + finalTime);
        return finalTime;
    }

    public Long getEpochTime() {
        Date date = new Date();
        return date.getTime();
    }

    public String getTimeZone() {
        LocalDateTime timeInZone = LocalDateTime.now(TimeZone.getTimeZone("America/Chicago").toZoneId());
        System.out.println("Time in Chicago: " + timeInZone);
        return timeInZone.toString();
    }
}

//String[] availableTimezones = TimeZone.getAvailableIDs();
//Instant time = Instant.now();
//create a new endpt to take in time zone and give it in that time zone


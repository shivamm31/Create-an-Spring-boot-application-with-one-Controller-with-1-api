package com.knoldus.SpringBootOneControllerOneAPI.contoller;

import com.knoldus.SpringBootOneControllerOneAPI.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @Autowired
    ApplicationService applicationService;

    //mapping request to this method
    @RequestMapping("/status")
    public String getStatusWithTime(){
        return applicationService.getTime();
    }
}

package com.springbootapp.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @RequestMapping("/test")
    public String myController(){
        return "Welcome to bunny and Family";
    }

    @RequestMapping("/config")
    public String myControllerConfig(){
        return "Welcome to config page";
    }
}

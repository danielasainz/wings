package com.sainz.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WingsController {

    @RequestMapping("/")
    public String showIndex(){
        return "wings";
    }
}

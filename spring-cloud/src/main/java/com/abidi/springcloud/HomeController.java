package com.abidi.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
//    @Autowired
//    private HomeService homeService;

    @GetMapping
    public String home(){
        return "index";
    }
}

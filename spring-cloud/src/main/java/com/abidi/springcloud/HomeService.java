package com.abidi.springcloud;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String hallo(){
        return "index";
    }
}

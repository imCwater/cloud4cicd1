package com.example.cloud4cicd1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @ResponseBody
    @GetMapping("/hi")
    public  String hi(){
        return  "h  ^^^^i 0630";
    }


    @ResponseBody
    @GetMapping("/hi2")
    public  String hi2(){
        return  "hi2    나해수 ";
    }


    @ResponseBody
    @GetMapping("/hi3")
    public  String hi3(){
        return  "hi3   ^^";
    }
}

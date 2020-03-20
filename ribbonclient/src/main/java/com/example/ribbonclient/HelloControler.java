package com.example.ribbonclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloServer helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        System.out.println("--------------hi()----------------------");
        return helloService.hiService(name);
    }


}

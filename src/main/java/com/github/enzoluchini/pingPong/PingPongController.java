package com.github.enzoluchini.pingPong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")
public class PingPongController {

    @GetMapping("/ping")
    public String pingResponse(){
        return "pong";
    }
    
}

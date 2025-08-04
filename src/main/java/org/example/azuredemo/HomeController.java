package org.example.azuredemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HomeController {

    public  HomeController() {
    }
    @GetMapping("/")
    public String home() {
        return "Hello World for azure 204"+ LocalDateTime.now();
    }
}

package org.example.azuredemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public  HomeController() {
    }
    @GetMapping("/")
    public String home() {
        return "Hello World for azure 204";
    }
}

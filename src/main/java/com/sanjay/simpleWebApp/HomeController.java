package com.sanjay.simpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet()
    {
        return "Hello World!";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "This is about page...";
    }

}

package com.sanjay.demoApplication;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile()
    {
        System.out.println("Compiling using laptop");
    }
}

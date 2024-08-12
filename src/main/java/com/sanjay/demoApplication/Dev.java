package com.sanjay.demoApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer comp;

    public void build()
    {
        comp.compile();
        System.out.println("Hello World!");
    }
}

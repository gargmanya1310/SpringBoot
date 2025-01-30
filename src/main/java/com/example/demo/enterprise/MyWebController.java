package com.example.demo.enterprise;

import org.springframework.stereotype.Component;

@Component
public class MyWebController
{
    public long returnValueFromBusinessService()
    {
        return 200;
    }
}

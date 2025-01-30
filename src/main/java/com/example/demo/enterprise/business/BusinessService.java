package com.example.demo.enterprise.business;

import com.example.demo.enterprise.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService
{
    @Autowired
    private DataService dataService;            //dependency injection using reflection i.e no constructor or anything used
    public long calculateSum()
    {
        List<Integer> data= dataService.getData();
        return data.stream().reduce(Integer::sum).get(); //functional programming
    }
}



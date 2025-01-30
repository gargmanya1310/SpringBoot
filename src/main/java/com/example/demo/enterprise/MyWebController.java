package com.example.demo.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyWebController
{
    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessService()
    {
        return businessService.calculateSum();
    }
}

@Component
class BusinessService
{
    @Autowired
    private DataService dataService;

    public long calculateSum()
    {
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get(); //functional programming
    }
}

@Component
class DataService
{
    public List<Integer> getData()
    {
        return Arrays.asList(10,20,30,40);
    }
}

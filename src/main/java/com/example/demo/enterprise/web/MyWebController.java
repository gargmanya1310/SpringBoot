package com.example.demo.enterprise.web;
import com.example.demo.enterprise.business.BusinessService;
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

//package com.example.demo.enterprise.business;
//
//@Component
//public class BusinessService
//{
//
//
//    @Autowired
//    public BusinessService(DataService dataService)
//    {
//        System.out.println("Constuctor injected");
//        this.dataService = dataService;
//    }
//
//
//    private DataService dataService;            //dependency injection using reflection i.e no constructor or anything used
//
////    public void setDataService(DataService dataService)
////    {
////        System.out.println("setter injection");
////        this.dataService = dataService;
////    }
//
//    public long calculateSum()
//    {
//        List<Integer> data= dataService.getData();
//        return data.stream().reduce(Integer::sum).get(); //functional programming
//    }
//}
//
//
//package com.example.demo.enterprise.data;
//
//@Component
// public class DataService
//{
//    public List<Integer> getData()
//    {
//        return Arrays.asList(10,20,30,40);
//    }
//}







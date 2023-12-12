package com.techm.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping(path = "/filtering")
    public SomeBean filtering(){
        return new SomeBean("val1", "val2", "val3");
    }

    @GetMapping(path = "/filtering-list")
    public List<SomeBean> filteringList(){
        return Arrays.asList(new SomeBean("val1", "val2", "val3"), new SomeBean("val4", "val5", "val6"), new SomeBean("val7", "val8", "val9"));
    }
}

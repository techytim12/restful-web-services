package com.techm.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping(path = "/filtering")
    public MappingJacksonValue filtering(){

        SomeBean someBean =  new SomeBean("p1", "p2", "p3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("val1", "val3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

    @GetMapping(path = "/filtering-list") // only val2, val3
    public MappingJacksonValue filteringList(){
        SomeBean someBean1 = new SomeBean("p1", "p2", "p3");
        SomeBean someBean2 = new SomeBean("p1", "p2", "p3");
        SomeBean someBean3 = new SomeBean("p1", "p2", "p3");
        List<SomeBean> beans = Arrays.asList(someBean1, someBean2, someBean3);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(beans);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("val2", "val3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}

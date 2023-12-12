package com.techm.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties("val1")
@JsonFilter("SomeBeanFilter")
public class SomeBean {

    private String val1;
    //@JsonIgnore
    private String val2;
    private String val3;

    public SomeBean(String val1, String val2, String val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public String getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }

    public String getVal3() {
        return val3;
    }
}

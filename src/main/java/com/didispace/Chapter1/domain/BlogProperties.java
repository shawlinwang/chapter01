package com.didispace.Chapter1.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {

    @Value("${com.didispace.blog.name}")
    private String name;
    @Value("${com.didispace.blog.title}")
    private String title;
    @Value("${com.didispace.blog.bignumber}")
    private Integer bignumber;

    public Integer getBignumber(){
        return this.bignumber;
    }
    public void setBignumber(Integer bignumber){
        this.bignumber=bignumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTitle(){ return this.title; }

    public void setTitle(String name){
        this.title = title;
    }

    public String getName(){ return this.name; }

}

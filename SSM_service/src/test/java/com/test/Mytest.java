package com.test;

import com.study.pojo.Linkman;
import com.study.service.LinkmanService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {
    @Test
    public void Test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        LinkmanService linkmanService = (LinkmanService) classPathXmlApplicationContext.getBean("linkmanService");
        List<Linkman> all = linkmanService.findAll();
        System.out.println(all);
    }
}

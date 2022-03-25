package com.test;

import com.study.dao.LinkmanDao;
import com.study.pojo.Linkman;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {

    @Test
    public void Test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:springmybatis.xml");
        LinkmanDao bean = (LinkmanDao) classPathXmlApplicationContext.getBean("linkmanDao");
        List<Linkman> all = bean.findAll();
        System.out.println(all);
    }
}

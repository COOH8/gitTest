package com.study.web;

import com.study.pojo.Linkman;
import com.study.service.LinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/linkman")
public class LinkmanController {
    @Autowired
    private LinkmanService linkmanService;

    @RequestMapping("/findAll")
    public List<Linkman> findAll(){
        return linkmanService.findAll();
    }
}

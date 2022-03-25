package com.study.service.impl;

import com.study.dao.LinkmanDao;
import com.study.pojo.Linkman;
import com.study.service.LinkmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("linkmanService")
public class LinkmanServiceImpl implements LinkmanService {
    @Autowired
    private LinkmanDao linkmanDao;

    @Override
    public List<Linkman> findAll() {
        return linkmanDao.findAll();
    }
}

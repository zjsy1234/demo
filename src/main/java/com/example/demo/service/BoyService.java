package com.example.demo.service;

import com.example.demo.bean.Boy;
import com.example.demo.dao.BoyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoyService {
    @Autowired
    private BoyDao boyDao;

    public void  andBoy(Boy boy){


        boyDao.save(boy);
    }
}

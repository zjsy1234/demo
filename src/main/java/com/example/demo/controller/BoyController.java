package com.example.demo.controller;

import com.example.demo.bean.Boy;
import com.example.demo.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BoyController {

    @Autowired
    private BoyService boyService;

//    @GetMapping(value="/boy")
//    public List<Boy> findAll(){
//        return boyDao.findAll();
//    }

    @PostMapping(value="/and")
    public void addBoy(@RequestParam("name")  String name,@RequestParam("sex")  String sex){
        Boy boy = new Boy();
        boy.setName(name);
        boy.setSex(sex);
        boyService.andBoy(boy);
    }
//    @PostMapping(value ="/find")
//    public Optional<Boy> findOne(@RequestParam("id") Integer id){
//        return boyDao.findById(id);
//    }
//    @DeleteMapping(value = "/del")
//    public String delBoy(@RequestParam("id") Integer id){
//        boyDao.deleteById(id);
//
//        return "chengong";
//    }
//    @PutMapping(value = "/update")
//    public Boy upBoy(@RequestParam("id") Integer id,@RequestParam(value = "name",required = false) String name,@RequestParam(value = "sex",required = false) String sex){
//        Boy boy = new Boy();
//        boy.setId(id);
//        boy.setSex(sex);
//        boy.setName(name);
//
//        return boyDao.save(boy);
//    }
}

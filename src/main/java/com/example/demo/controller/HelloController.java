package com.example.demo.controller;


import com.example.demo.bean.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    private Girl girl;

//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private String age;
//
//    @Value("${cupsize}")
//    private String cupsize;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    String say(){
        // return "亲爱的"+name +"同学，"+"你的年纪虽然只有"+age+"但是你的罩杯确实 "+cupSize;
        return girl.getName()+girl.getCupsize()+girl.getAge();
    }

//    @RequestMapping(value={"/hello","/hi"},method = RequestMethod.GET)
//    String say1(){
//        // return "亲爱的"+name +"同学，"+"你的年纪虽然只有"+age+"但是你的罩杯确实 "+cupSize;
//        return girl.getName()+girl.getCupsize()+girl.getAge();
//    }
    //value 请求方法名称 带参数的
    @RequestMapping(value= {"/hi/{id}"},method = RequestMethod.GET)
    String say2(@PathVariable("id") Integer id) {
        // return "亲爱的"+name +"同学，"+"你的年纪虽然只有"+age+"但是你的罩杯确实 "+cupSize;
     //   return girl.getName()+girl.getCupsize()+girl.getAge();
        return id.toString();
    }
    //method请求方法类型  RequestMethod.GET 为get类型
    @RequestMapping(value = "/see",method = RequestMethod.GET)
    String see(@RequestParam("id") Integer id ){
        return id.toString();
    }
    // 请求方法required是否必须，defaultValue 默认值
    @RequestMapping(value = "/see1",method = RequestMethod.GET)
    String see1(@RequestParam(value="id" ,required =false , defaultValue ="0") Integer id ){
        return id.toString();
    }

    @GetMapping(value = "/see2")
    String see2(@RequestParam(value="id" ,required =false , defaultValue ="0") Integer id ){
        return id.toString();
    }
}

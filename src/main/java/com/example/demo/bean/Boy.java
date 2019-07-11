package com.example.demo.bean;

import javax.persistence.*;

@Table(name = "boy")
@Entity
public class Boy {

    @Id
    @GeneratedValue             //(strategy = GenerationType.IDENTITY) //指定主键生成策略
    private Integer id;
    private String name;
    private String sex;

    public Boy(){

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

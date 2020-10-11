package com.yuanheng.spring;

import java.util.List;

public class StudentComplex {

    public int age;
    public String name;
    public List<String> list;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "StudentComplex{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}

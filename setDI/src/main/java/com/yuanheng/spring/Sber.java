package com.yuanheng.spring;

import java.util.Date;

public class Sber {

    public int age;
    public String name;
    public ForInsert forInsert;

    public Sber() {
    }

    public Sber(int age, String name, ForInsert forInsert) {
        this.age = age;
        this.name = name;
        this.forInsert = forInsert;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ForInsert getForInsert() {
        return forInsert;
    }

    public void setForInsert(ForInsert forInsert) {
        this.forInsert = forInsert;
    }

    @Override
    public String toString() {
        return "Sber{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", forInsert=" + forInsert +
                '}';
    }
}

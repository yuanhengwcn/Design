package com.yuanheng.spring;

public class Toolsman {

    public int age;
    public String name;

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

    public Toolsman(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Toolsman() {
    }

    @Override
    public String toString() {
        return "Toolsman{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

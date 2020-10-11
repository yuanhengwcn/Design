package com.yuanheng.spring;

public class ForInsert {

    public String property;

    public ForInsert(String property) {
        this.property = property;
    }

    public ForInsert() {
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "ForInsert{" +
                "property='" + property + '\'' +
                '}';
    }
}

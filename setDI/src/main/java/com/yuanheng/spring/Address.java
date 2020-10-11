package com.yuanheng.spring;

public class Address {

    public String position;

    public int zipCode;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "position='" + position + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public Address() {
    }

    public Address(String position, int zipCode) {
        this.position = position;
        this.zipCode = zipCode;
    }
}

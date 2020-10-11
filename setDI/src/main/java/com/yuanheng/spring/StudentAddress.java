package com.yuanheng.spring;

public class StudentAddress {

    Address address = new Address();

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "address=" + address +
                '}';
    }
}

package com.yuanheng.dynamicProxy;

public class Agender implements Rent{

    private Rent rent;
    public void setRent(Rent rent){
        this.rent = rent;
    }

    public void house() {
        System.out.println("发布出租信息");
        System.out.println("带客户看房");
        rent.house();
    }




}

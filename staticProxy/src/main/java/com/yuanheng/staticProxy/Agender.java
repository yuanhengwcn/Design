package com.yuanheng.staticProxy;

public class Agender implements Rent{

    private Rent rent;

    //使用下面的house()方法前，需要先给rent进行填充
    //在Application中是将作为Rent的实现类的Landlord做了填充
    public void setRent(Rent rent){
        this.rent = rent;
    }

    public void house() {
        System.out.println("发布出租信息");
        System.out.println("带客户看房");
        rent.house();
    }




}

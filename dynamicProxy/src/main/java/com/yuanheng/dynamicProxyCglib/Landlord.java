package com.yuanheng.dynamicProxyCglib;

public class Landlord implements Rent {
    public void house() {
        System.out.println("签合同");
        System.out.println("收租金");
    }
}

package com.yuanheng.staticProxy;

public class Application {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        Agender agender = new Agender();
        agender.setRent(landlord);
        agender.house();
    }
}

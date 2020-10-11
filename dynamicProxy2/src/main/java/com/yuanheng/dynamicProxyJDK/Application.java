package com.yuanheng.dynamicProxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("发布信息");
                System.out.println("看房");

                method.invoke(landlord, args);

                return null;
            }
        };

        Rent rent = (Rent) Proxy.newProxyInstance(landlord.getClass().getClassLoader(), landlord.getClass().getInterfaces(), handler);

        rent.house();
    }

}

package com.yuanheng.dynamicProxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Application {
    public static void main(String[] args) {

        //创建一个房东对象
        final Landlord landlord = new Landlord();

        //创建一个handler
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("发布出租信息");
                System.out.println("带客户看房");

                method.invoke(landlord,args);

                return null;
            }
        };

        //将这个handler传进实例中
        Rent rent = (Rent) Proxy.newProxyInstance(Landlord.class.getClassLoader(), Landlord.class.getInterfaces(),handler);

        rent.house();



    }

}

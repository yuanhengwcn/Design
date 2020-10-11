package com.yuanheng.dynamicProxyCglib;

import com.yuanheng.dynamicProxyJDK.Rent;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args) {

        Landlord landlord = new Landlord();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(landlord.getClass());

        enhancer.setCallback(new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("发布信息");
                System.out.println("看房");
                Object object = method.invoke(landlord, objects);
                return object;
            }
        });

        Landlord proxyLandlord = (Landlord) enhancer.create();

        proxyLandlord.house();
    }

}

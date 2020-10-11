package com.yuanheng.dynamicProxyCglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {

        //创建一个被代理的对象
        final Landlord landlord = new Landlord();

        //使用Enhancer类创造一个enhancer对象，这个enhancer对象是代理对象生成器
        Enhancer enhancer = new Enhancer();

        //将这个enhancer对象，关联上被代理的对象
        enhancer.setSuperclass(landlord.getClass());

        //给代理对象生成器enhancer添加上逻辑，逻辑里面使用到被代理对象的相关数据
        enhancer.setCallback(new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("发布出租信息");
                System.out.println("带客户看房");
                Object object = method.invoke(landlord, objects);
                return object;
            }
        });

        //现在就可以生成真实的代理对象了
        Landlord proxylandlord = (Landlord) enhancer.create();


        proxylandlord.house();



    }

}

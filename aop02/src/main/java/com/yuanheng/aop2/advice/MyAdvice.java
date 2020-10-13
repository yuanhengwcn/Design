package com.yuanheng.aop2.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.aop2.advice
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-12 21:50
 */
public class MyAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("吃饱睡好");
    }
}

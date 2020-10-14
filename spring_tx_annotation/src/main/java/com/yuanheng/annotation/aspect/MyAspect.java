package com.yuanheng.annotation.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.annotation.aspect
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 19:06
 */

//指明当前类作为一个切面对象
@Component

//当前是一个切面，切入点+通知
@Aspect
public class MyAspect {

    //第二步，指明切入点
    //注解指明要切入的位置，UserService类下所有的方法都要被切入
    @Pointcut("execution(* com.yuanheng.annotation.service.UserService.*(..))")
    //切入的方法是aa(),这个方法名无所谓，主要是切入点必须附着到一个方法上
    public void aa(){}

    //第三步，配置要被织入的方法
    @Before(value="aa()")
    public void before(){
        System.out.println("前置通知");
    }
}

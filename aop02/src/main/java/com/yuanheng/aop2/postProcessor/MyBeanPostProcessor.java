package com.yuanheng.aop2.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.aop2.postProcessor
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-12 21:55
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器的前置方法");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器的后置方法");
        return null;
    }
}

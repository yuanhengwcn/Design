package com.yuanheng.springmvc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.exception
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-15 14:47
 */
public class MyExResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ex.printStackTrace();
        ModelAndView modelAndView = new ModelAndView();

        if(ex instanceof IOException){
            modelAndView.addObject("error","IO异常");
        }else if (ex instanceof RuntimeException){
            modelAndView.addObject("error", "运行时异常");
        }
        modelAndView.setViewName("error");

        return modelAndView;
    }
}

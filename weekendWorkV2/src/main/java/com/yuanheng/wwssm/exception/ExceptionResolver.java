package com.yuanheng.wwssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.exception
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 13:06
 */
public class ExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        e.printStackTrace();
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof MyException){
            modelAndView.addObject("error", e.getMessage());
            modelAndView.setViewName("/common/error");
        }
        return modelAndView;
    }
}

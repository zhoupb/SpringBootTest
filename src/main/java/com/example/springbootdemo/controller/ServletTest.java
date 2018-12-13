package com.example.springbootdemo.controller;

import javax.servlet.*;
import java.io.IOException;

//Servlet的生命周期:从Servlet被创建到Servlet被销毁的过程
//一次创建，到处服务
//一个Servlet只会有一个对象，服务所有的请求
/*
 * 1.实例化（使用构造方法创建对象）
 * 2.初始化  执行init方法
 * 3.服务     执行service方法
 * 4.销毁    执行destroy方法
 */
public class ServletTest implements Servlet{

    //生命周期方法:当Servlet第一次被创建对象时执行该方法,该方法在整个生命周期中只执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }



    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //生命周期方法:对客户端响应的方法,该方法会被执行多次，每次请求该servlet都会执行该方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    //生命周期方法:当Servlet被销毁时执行该方法
    @Override
    public void destroy() {

    }
}

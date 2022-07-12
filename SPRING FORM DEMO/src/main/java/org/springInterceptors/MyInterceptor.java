package org.springInterceptors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor extends HandlerInterceptorAdapter
{
    // This is between view and controller
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        System.out.println("This is prehandler..");

        String name = request.getParameter("name");
        if(name.startsWith("d"))
        {
            response.setContentType("text/html");
            response.getWriter().println("Invalid name! Name should not start with d");
            return false;
        }
        return true;
    }

    // This is between controller and View Resolver
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {
        System.out.println("This is posthandler..");


    }

    // This is between View Resolver and view

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {
        System.out.println("This is afterCompletion..");
    }
}

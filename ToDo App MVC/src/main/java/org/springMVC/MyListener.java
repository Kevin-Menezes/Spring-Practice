package org.springMVC;

import org.springMVC.entities.Todo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.List;

public class MyListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
        System.out.println("Context created...");
        List<Todo> list = new ArrayList<Todo>();
        ServletContext context = sce.getServletContext();
        context.setAttribute("list",list);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {

    }
}

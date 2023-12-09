package com.example.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;

@WebListener
public class ContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce){
        ServletContext context = sce.getServletContext();
        LocalDateTime servletTimeInit = LocalDateTime.now();
        context.setAttribute("servletTimeInit", servletTimeInit);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    //write your code here!
}

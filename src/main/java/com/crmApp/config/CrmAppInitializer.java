package com.crmApp.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;


public class CrmAppInitializer extends AbstractDispatcherServletInitializer{

    @Override
    protected WebApplicationContext createServletApplicationContext(){
        XmlWebApplicationContext ctx = new XmlWebApplicationContext();
        ctx.setConfigLocation("/WEB-INF/spring/CrmApp-servlet.xml");
        return ctx;
    }

    @Override
    protected String[] getServletMappings() {
        String[] map = {"/crm/*"};
        return map;
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
//public class CrmAppInitializer extends WebApplicationInitializer{

//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//        appContext.setConfigLocation("/WEB-INF/spring/CrmApp-servlet.xml");
//
//        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher",
//                new DispatcherServlet(appContext));
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/");
//    }
//}

package com.crmApp.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
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
        String[] map = {"/crm/*","/crm1/*"};
        return map;
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    //Overriding dispatcher servlet creation to allow set ThrowExceptionIfNoHandlerFound=true
    //so that we can return custom error view when No handler available for a request.
    @Override
    protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
        DispatcherServlet ds = new DispatcherServlet(servletAppContext);
        ds.setThrowExceptionIfNoHandlerFound(true);
        return ds;
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

package com.crmApp.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RequestLoggerInterceptors implements HandlerInterceptor {
    private Logger logger = Logger.getLogger(RequestLoggerInterceptors.class.getName());
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception{
        logger.log(Level.INFO, "Incoming Request for "+request.getRequestURI());
        logger.logp(Level.INFO, RequestLoggerInterceptors.class.getName(), "preHandle",
                "Incoming Request for "+request.getRequestURI());
        return true;
    }
}

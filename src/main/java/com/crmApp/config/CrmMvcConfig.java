package com.crmApp.config;

import com.crmApp.interceptors.RequestLoggerInterceptors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@ComponentScan(basePackages = "com.crmApp")
@Configuration
@EnableWebMvc
public class CrmMvcConfig implements WebMvcConfigurer {

    @Bean(name="smExceptionResolver")
    public SimpleMappingExceptionResolver createSmExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();

        Properties maps = new Properties();
        maps.put("ResourceNotFoundException","ResourceNotFound");
        maps.put("NoHandlerFoundException","error");

        resolver.setExceptionMappings(maps);
        resolver.setDefaultErrorView("error");
        resolver.setExceptionAttribute("ex");
        resolver.setWarnLogCategory("com.crmApp");
        //Setting highest priority, so that the uncaught exceptions are caught by SimpleMappingExceptionResolver only
        //and not by any other exception resolver in Spring.
        resolver.setOrder(Ordered.HIGHEST_PRECEDENCE);

        return resolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){
        interceptorRegistry.addInterceptor(new RequestLoggerInterceptors())
                .addPathPatterns("/**")
                .excludePathPatterns("/admin/**");
    }
}

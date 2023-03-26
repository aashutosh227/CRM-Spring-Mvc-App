package com.crmApp.controller;

import com.crmApp.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/test")
public class TestController {
    private Logger logger = Logger.getLogger(TestController.class.getName());
    @GetMapping
    public String test(ModelMap mp){
        mp.addAttribute("msg","This is test for CRM App");
        return "test";
    }

    @GetMapping("/t1")
    public String testEx(ModelMap mp) throws Exception {
        int i=0;
        logger.log(Level.INFO,"This is a ResourceNotFoundException!!");
        if(i==0) throw new ResourceNotFoundException("The requested Item was not found");
        return "error1";
    }

    @GetMapping("/t2")
    public String testEx1(ModelMap mp) throws Exception {
        int i=0;
        logger.log(Level.INFO,"This is a generic exception!!");
        if(i==0) throw new Exception("This is generic exception");
        return "error1";
    }
}

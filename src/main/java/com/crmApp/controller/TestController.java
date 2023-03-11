package com.crmApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String test(ModelAndView mv){
        mv.addObject("msg","This is test for CRM App");
        return "test";
    }
}

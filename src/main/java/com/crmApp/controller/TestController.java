package com.crmApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String test(ModelMap mp){
        mp.addAttribute("msg","This is test for CRM App");
        return "test";
    }
}

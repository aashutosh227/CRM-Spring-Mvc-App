package com.crmApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/home")
    public ModelAndView getHome(){
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("msg","Customer Table");
        return mv;
    }

    @GetMapping("/AddCustomer")
    public ModelAndView addCustomer(){
        ModelAndView mv = new ModelAndView("addCustomer");
        mv.addObject("msg","Customer Table");
        return mv;
    }
}

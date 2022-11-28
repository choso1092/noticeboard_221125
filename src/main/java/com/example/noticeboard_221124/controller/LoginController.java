package com.example.noticeboard_221124.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping({"","login"})
    public ModelAndView loginPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/login");
        return mv;
    }

}

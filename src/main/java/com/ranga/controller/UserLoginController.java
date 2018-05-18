package com.ranga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserLoginController {

    @RequestMapping("/authorization")
    public ModelAndView userAuthorization() {
        return new ModelAndView("authorization");
    }

    @RequestMapping("/registration")
    public ModelAndView userRegistration() {
        return new ModelAndView("registration");
    }
}

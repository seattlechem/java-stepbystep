package com.stepbystep.demo.controller;

import com.stepbystep.demo.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
    @Autowired
    LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcomePage(@RequestParam String userName,
        @RequestParam String password, ModelMap model) {
            model.put("userName", userName);

            boolean isValid = service.validateUser(userName, password);

            if (!isValid) {
                model.put("errorMessage", "Username / Password is incorrect!");
                return "login";
            }
        return "welcome";
    }

}

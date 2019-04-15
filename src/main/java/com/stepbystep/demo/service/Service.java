package com.stepbystep.demo.service;

import org.springframework.stereotype.Component;

@Component
public class Service {
    
    public boolean validateUser(String userName, String password) {
        if (userName.equalsIgnoreCase("peter") &&
            password.equalsIgnoreCase("myPassword")) {
                return true;
            }
        return false;
    }
}

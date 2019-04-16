package com.stepbystep.demo.controller;

import com.stepbystep.demo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "listtodos", method = RequestMethod.GET)
    public String displayAllTodo(ModelMap model) {
        model.put("allTodos",todoService.listAllTodos());
        return "listAllTodo";
    }
}

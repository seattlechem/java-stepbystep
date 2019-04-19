package com.stepbystep.demo.controller;

import java.io.Console;

import com.stepbystep.demo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userName")
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "listtodos", method = RequestMethod.GET)
    public String displayAllTodo(ModelMap model) {
        model.put("allTodos", todoService.listAllTodos());
        return "listAllTodo";
    }

    @RequestMapping(value = "addtodo", method = RequestMethod.GET)
    public String displayAddTodo(ModelMap model) {
        model.put("allTodos", todoService.listAllTodos());
        return "addTodo";
    }

    @RequestMapping(value = "addtodo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @RequestPart String desc, @RequestPart String year, @RequestPart String month,
            @RequestPart String date) {
        todoService.addTodo((String) model.get("userName"), desc, 2019, 5, 9);
        // (int) Integer.valueOf(year),
        // (int) Integer.valueOf(month),
        // (int) Integer.valueOf(date));
        return "redirect:/listtodos";
    }
}

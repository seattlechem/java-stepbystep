package com.stepbystep.demo.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.stepbystep.demo.model.Todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    List<Todo> todos = new ArrayList<Todo>();
    private static int count = 3;


    public TodoService() {
        // create list Todo
        todos.add(new Todo(1, "peter", "prepare documents for loan", getDate(2019, 5, 9), false));
        todos.add(new Todo(2, "albert", "brush teeth", getDate(2019, 4, 15), false));
        todos.add(new Todo(3, "clare", "bring homework everyday", getDate(2019, 6, 30), false));
    }
    
    public Date getDate(int year, int month, int date) {
        Calendar c1 = Calendar.getInstance();
        c1.set(year, month, date);
        Date date1 = c1.getTime();
        return date1;
    }

    public List<Todo> filterTodosByUser(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for(Todo todo: todos) {
            if (todo.getUser().contentEquals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public List<Todo> deleteTodo(int id) {
        todos.remove(id);
        return todos;
    }

    public void addTodo(String user, String desc, int year, int month, int date) {
        todos.add(new Todo(count++, user, desc, getDate(year, month, date), false));
    }

    public List<Todo> listAllTodos() {
        return todos;
    }
}



package com.josh.connect.frontend.with.backend.controller;

import com.josh.connect.frontend.with.backend.entity.Todo;
import com.josh.connect.frontend.with.backend.exception.ApiResponse;
import com.josh.connect.frontend.with.backend.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ApiResponse homeController(){
        ApiResponse res = new ApiResponse();
        res.setMessage("welcome to todo api");
        res.setStatus(true);
        return res;
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

    @DeleteMapping("/todos/{id}")
    public ApiResponse deleteTodo(@PathVariable Long id) throws Exception{
        todoService.deleteTodo(id);
        ApiResponse res = new ApiResponse();
        res.setMessage("Todo deleted");
        res.setStatus(true);
        return res;
    }
}
package com.josh.connect.frontend.with.backend.service;

import com.josh.connect.frontend.with.backend.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo createTodo(Todo todo);

    void deleteTodo(Long id) throws Exception;
}

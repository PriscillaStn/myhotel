package com.myhotel.demo.services;

import java.util.List;

import com.myhotel.demo.model.Todo;

public interface TodoService {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    void updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}
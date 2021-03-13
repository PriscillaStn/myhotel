package com.myhotel.demo.bootstrap;

import com.myhotel.demo.model.Todo;
import com.myhotel.demo.model.TodoStatus;
import com.myhotel.demo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoLoader implements CommandLineRunner {
    public final TodoRepository todoRepository;

    public TodoLoader(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadTodos();
    }

    private void loadTodos() {
        if (todoRepository.count() == 0) {
            todoRepository.save(
                    Todo.builder()
                            .marca("MAZDA")
                            .modelo("3")
                            .todoStatus(TodoStatus.AUTO)
                            .build()
            );
            todoRepository.save(
                    Todo.builder()
                            .marca("MACK")
                            .modelo("3/4")
                            .todoStatus(TodoStatus.CAMION)
                            .build()
            );
            System.out.println("Sample Todos Loaded");
        }
    }
}

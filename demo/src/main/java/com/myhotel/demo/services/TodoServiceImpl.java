package com.myhotel.demo.services;

import com.myhotel.demo.model.Todo;
import com.myhotel.demo.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getTodos() {
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    @Override
    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public Todo insert(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void updateTodo(Long id, Todo todo) {
        Todo todoFromDb = todoRepository.findById(id).get();
        System.out.println(todoFromDb.toString());
        if(todo.getTodoStatus()!=null) {
        	todoFromDb.setTodoStatus(todo.getTodoStatus());
        }
        if(todo.getMarca()!=null) {
        	todoFromDb.setMarca(todo.getMarca());
        }
        if(todo.getModelo()!=null) {
        	todoFromDb.setModelo(todo.getModelo());
        }
        if(todo.getPatente()!=null) {
        	todoFromDb.setPatente(todo.getPatente());
        }
        if(todo.getAnio()>-1) {
        	todoFromDb.setAnio(todo.getAnio());
        }
        if(todo.getKilometraje()>-1) {
        	todoFromDb.setKilometraje(todo.getKilometraje());;
        }
        if(todo.getCilindrada()!=null) {
        	todoFromDb.setCilindrada(todo.getCilindrada());
        }
        if(todo.getTipoAutomovil()!=null) {
        	todoFromDb.setTipoAutomovil(todo.getTipoAutomovil());
        }
        if(todo.getNPuertas()>-1) {
        	 todoFromDb.setNPuertas(todo.getNPuertas());
        }
        if(todo.getNPuertas()>-1) {
        	todoFromDb.setNPuertas(todo.getNPuertas());
        }
        if(todo.getCapPasajeros()>-1) {
        	todoFromDb.setCapPasajeros(todo.getCapPasajeros());
        }
        if(todo.getCapMaletero()>-1) {
        	todoFromDb.setCapMaletero(todo.getCapMaletero());
        }
        if(todo.getTipoCamion()!=null) {
        	 todoFromDb.setTipoCamion(todo.getTipoCamion());
        }
        if(todo.getCapToneladas()>-1) {
        	todoFromDb.setCapToneladas(todo.getCapToneladas());
        }
        if(todo.getTodoStatus()!=null) {
        	todoFromDb.setEjes(todo.getEjes());
        }
        
        
        
        
       
        
        
        todoRepository.save(todoFromDb);
    }

    @Override
    public void deleteTodo(Long todoId) {
        todoRepository.deleteById(todoId);
    }
}

package com.abolkog.springboot.tut;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {

	//@Autowired
	private TodoService todoServices;

	
	
	public TodoController(TodoService todoServices) {
		super();
		this.todoServices = todoServices;
	}

	@GetMapping(value = { "", "/" })
	public List<Todo> getAllTodos() {
		return todoServices.findAll();
	}

	@GetMapping("/{id}")
	public Todo getTodoById(@PathVariable int id) {
		return todoServices.getById(id);
	}

}

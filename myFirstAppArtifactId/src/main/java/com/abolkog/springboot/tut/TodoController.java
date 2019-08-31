package com.abolkog.springboot.tut;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {

	@Autowired
	private TodoService todoServices;

	@GetMapping(value = { "", "/" })
	public List<Todo> getAllTodos() {
		return todoServices.findAll();
	}

	@GetMapping("/{id}")
	public Todo getTodoById(@PathVariable int id) {
		return todoServices.getById(id);
	}
	
	@PostMapping(value= {"","/"})
	public Todo createNewTodo(@RequestBody Todo todo) {
		if(todoServices.save(todo)) {
			return todo;
		}
		return null;
	}

	@DeleteMapping ("/{id}")
	public void deleteTodo(@PathVariable int id) {
		todoServices.delete(id);
	}
	
	
	
}

//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-devtools</artifactId>
//<scope>runtime</scope>
//</dependency>



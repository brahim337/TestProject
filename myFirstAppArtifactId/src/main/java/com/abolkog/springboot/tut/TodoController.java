package com.abolkog.springboot.tut;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Todo>> getAllTodos() {
		List<Todo> result = todoServices.findAll();
		return new ResponseEntity<>(result, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Todo> getTodoById(@PathVariable String id) {
		Todo result = todoServices.getById(id);
		return new ResponseEntity<>(result, HttpStatus.OK);

	}

	@PostMapping(value = { "", "/" })
	public ResponseEntity<Todo> createNewTodo(@Valid @RequestBody Todo todo) {

		Todo result = todoServices.save(todo);
		return new ResponseEntity<>(result, HttpStatus.CREATED);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String id) {
		todoServices.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}

//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-devtools</artifactId>
//<scope>runtime</scope>
//</dependency>

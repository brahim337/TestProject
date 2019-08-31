package com.abolkog.springboot.tut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private List<Todo> data = new ArrayList<>(Arrays.asList(

			new Todo(1, "first Todo"), new Todo(2, "second Todo"), new Todo(3, "third Todo"),
			new Todo(4, "fourth Todo"), new Todo(5, "fifth Todo"), new Todo(6, "sixth Todo"),
			new Todo(7, "seventh Todo"), new Todo(8, "eight Todo")

	));

	public Todo getById(int id) {

		for (Todo todo : data) {
			if (todo.getI() == id)
				return todo;
		}
		return null;
	}

	public List<Todo> findAll() {
		// TODO Auto-generated method stub
		return data;
	}

	

	public boolean save(Todo todo) {
		// TODO Auto-generated method stub
		return data.add(todo);
	}
	
	public void delete(int id) {
		for (Todo todo: data) {
			if(todo.getI()== id) 
				data.remove(todo);
				
				return ;
		}
	}

}

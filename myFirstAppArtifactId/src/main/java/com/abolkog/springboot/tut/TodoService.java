package com.abolkog.springboot.tut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	@Autowired
	private TodosRepositories todoRepositories;
	
	public List<Todo> findAll() {
		// TODO Auto-generated method stub
		return todoRepositories.findAll();
	}
	

	public Todo getById(String id) {

		return todoRepositories.findById(id).get();
		
	}

	public Todo save(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepositories.insert(todo);
	}
	
	public void delete(String id) {
		
		todoRepositories.deleteById(id);		
		
				
		}
	

}

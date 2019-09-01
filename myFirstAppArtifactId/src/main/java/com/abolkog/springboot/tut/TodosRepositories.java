package com.abolkog.springboot.tut;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosRepositories extends MongoRepository<Todo, String> {

	void deleteById(String id);

	Todo insert(Todo todo);

}

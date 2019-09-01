package com.abolkog.springboot.tut;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Todos")
public class Todo {
	@Id
	private String id;

	@NotNull(message="Title is required")
	@Size(min =3 , message="Title must be at least 3 character long")
	private String name;
	private Long timeStamp;

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Todo(String i2, String name2) {
		// TODO Auto-generated constructor stub
		id = i2;
		name = name2;
		timeStamp = System.currentTimeMillis();

	}

	public Todo() {
		timeStamp = System.currentTimeMillis();
	}

}

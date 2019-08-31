package com.abolkog.springboot.tut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ RestController
public class HomeController {

	@ RequestMapping(value="/")
	
			public String greting() {
		return "Hellooo, welcom  ara7mani titi !!";
	}
	
	@ GetMapping(value ="/{name}")
	public String greetinWitheName(@PathVariable String name) {
		return String.format ("Salam ya 3ini %s",name);
	}
}

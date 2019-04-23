package com.capgemini.personsql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.personsql.entity.Person;
import com.capgemini.personsql.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@PostMapping(value="/add",produces=MediaType.APPLICATION_JSON_VALUE)
	public Person  add(@RequestBody Person person) {
		
		return service.addPerson(person);
	}
	@GetMapping(value="/all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Person> all(){
		return service.findAll();
	}
}





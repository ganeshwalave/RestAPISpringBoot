package com.persistent.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.model.Person;
import com.persistent.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;
	
	@RequestMapping("/person/all")
	public Map<String, Person> getAllPerson() {	
		System.out.println("*************** Inside getAllPerson ************");
		return personService.getAllPerson();		
	}
	
	@RequestMapping("/person/{id}")
	public Person getPerson(@PathVariable("id") String id) {		
		return personService.getPerson(id);		
	}
	
}

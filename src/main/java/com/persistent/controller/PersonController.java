package com.persistent.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		return personService.getAllPerson();		
	}
	
	@RequestMapping("/person/list")
	public List<Person> getListPerson() {
		List<Person> list = new ArrayList<Person>();
		for(Entry<String, Person> person : personService.getAllPerson().entrySet()) {
			list.add(person.getValue());
		}
		return list;		
	}
	
	@RequestMapping("/person/{id}")
	public Person getPerson(@PathVariable("id") String id) {		
		return personService.getPerson(id);		
	}
	
}

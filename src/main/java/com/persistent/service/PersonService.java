package com.persistent.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.persistent.model.Person;

@Service
public class PersonService {
	
	private Map<String, Person> personMap = new HashMap<String, Person>();
	
	public PersonService() {
		Person p1= new Person();
		p1.setIdNumber("100");
		p1.setName("Sandeep");
		p1.setSurName("Gadre");
		p1.setAge(38);
		personMap.put("1", p1);
		
		Person p2= new Person();
		p2.setIdNumber("200");
		p2.setName("Ajay");
		p2.setSurName("Bakshi");
		p2.setAge(24);
		personMap.put("2", p2);
	}

	public Person getPerson(String id) {
		if(null!=id && personMap.containsKey(id))
			return personMap.get(id);
		else
			return null;
	}
	public Map<String, Person> getAllPerson() {		
		return personMap;
	}
}

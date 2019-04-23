package com.capgemini.personsql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.personsql.dao.PersonDao;
import com.capgemini.personsql.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao dao;
	@Override
	public Person addPerson(Person person) {
	
		return dao.save(person);
	}
	@Override
	public List<Person> findAll() {
		
		return dao.findAll();
	}

}

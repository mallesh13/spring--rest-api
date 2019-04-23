package com.capgemini.personsql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.personsql.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{

}

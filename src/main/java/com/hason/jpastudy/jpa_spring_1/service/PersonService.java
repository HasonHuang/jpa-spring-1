package com.hason.jpastudy.jpa_spring_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hason.jpastudy.jpa_spring_1.dao.PersonDao;
import com.hason.jpastudy.jpa_spring_1.entity.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Transactional
	public void savePersons(Person person1, Person person2) {
		personDao.save(person1);
		personDao.save(person2);
	}
}

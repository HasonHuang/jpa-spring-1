package com.hason.jpastudy.jpa_spring_1.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hason.jpastudy.jpa_spring_1.entity.Person;

@Repository
public class PersonDao {
	
	// 如何获取和当前事务管理的 EntityManager 对象？
	// 通过 @PersistenceContext 标记成员变量！
	@PersistenceContext
	private EntityManager entityManager;

	public void save(Person person) {
		entityManager.persist(person);
	}
}

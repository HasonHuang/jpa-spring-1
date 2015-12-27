package com.hason.jpastudy.jpa_spring_1;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hason.jpastudy.jpa_spring_1.entity.Person;
import com.hason.jpastudy.jpa_spring_1.service.PersonService;

public class JPATest {
	
	private PersonService personService;
	
	private ApplicationContext context = null;
	
	{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		personService = context.getBean(PersonService.class);
	}
	
	//测试dataSource
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = context.getBean(org.apache.tomcat.jdbc.pool.DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	
	// 测试 spring + jpa 能否运行
	@Test
	public void testPersonService() {
		Person person1 = new Person();
		person1.setAge(1);
		person1.setEmail("hason.com");
		person1.setLassName("hason 1");
		
		Person person2 = new Person();
		person2.setAge(2);
		person2.setEmail("hason.com");
		person2.setLassName("hason 2");
		
		System.out.println(personService.getClass().getName());
		
		personService.savePersons(person1, person2);
	}

}

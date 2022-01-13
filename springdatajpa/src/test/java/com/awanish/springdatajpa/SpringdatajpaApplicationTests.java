package com.awanish.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.awanish.springdatajpa.entites.Student;
import com.awanish.springdatajpa.repo.StudentRepo;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	StudentRepo studentRepo;

	@Test
	public void testSaveData() {
		
		Student student = new Student();
		
		student.setId(1);
		student.setName("Mark");
		student.setTestScore(100);
		
		studentRepo.save(student);
		
		Student studentData = studentRepo.findById(1).get();
		
		assertNotNull(studentData);
		
	}

}

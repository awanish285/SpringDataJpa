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

	// this method is used to save the data into the h2 database
	@Test
	public void testSaveData() {
        //Making object of student class to set the field data
		Student student = new Student();

		student.setId(1);
		student.setName("Mark");
		student.setTestScore(100);

		studentRepo.save(student);
        //this is used to fetch the data from database by id
		Student studentData = studentRepo.findById(1).get();
        
		assertNotNull(studentData);

	}

}

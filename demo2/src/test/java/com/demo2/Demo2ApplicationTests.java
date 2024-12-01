package com.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo2.entities.Student;
import com.demo2.repository.StudentRepository;

@SpringBootTest
class Demo2ApplicationTests {

	
	@Autowired
	private StudentRepository StudentRepo;
	
	
	@Test
	void saveStudent() {
		System.out.println(StudentRepo);
				
		
		Student st =new Student();
		
	
		st.setName("mike");
		st.setCourse("Java");
		st.setFee(45000);
		StudentRepo.save(st);
	}

}

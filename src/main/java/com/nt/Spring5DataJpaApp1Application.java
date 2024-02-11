package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Student;
import com.nt.repository.StudentRepository;

@SpringBootApplication
public class Spring5DataJpaApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Spring5DataJpaApp1Application.class, args);
		
		StudentRepository stry= context.getBean(StudentRepository.class);
		
		/*
		 * List<Student> maleStudent=stry.findByGender("male");
		 * 
		 * maleStudent.forEach(System.out::println);
		 */
		
		List<Student> top=stry.findByRankGreaterThan(2);
		top.forEach(System.out::println);
		/*
		 * Iterable<Student> findAll=stry.findAll();
		 * 
		 * findAll.forEach(s ->System.out.println(s));
		 */
		//Add multiple, record at a time
		
		/*
		 * Student s1=new Student(102,"Ram",4,"Male"); Student s2=new
		 * Student(103,"sham",5,"Male"); Student s3=new Student(104,"Rani",14,"FeMale");
		 * Student s4=new Student(1022,"megha",10,"Male");
		 * 
		 * List<Student> student=Arrays.asList(s1,s2,s2,s3,s4);
		 * 
		 * stry.saveAll(student);
		 * 
		 * System.out.println("Record inserted Succefully");
		 */
	}

}

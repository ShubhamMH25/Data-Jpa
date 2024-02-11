package com.nt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	public List<Student>findByGender(String gender);
	
	public List<Student> findByRankGreaterThan(Integer rank);
}

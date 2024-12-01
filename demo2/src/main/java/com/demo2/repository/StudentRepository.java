package com.demo2.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo2.entities.Student;



public interface StudentRepository extends CrudRepository<Student, Long> {

}

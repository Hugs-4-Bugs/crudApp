package com.codemyth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemyth.model.Employee;

//  Repository layers are interface so always denote the class with the "interface" as
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

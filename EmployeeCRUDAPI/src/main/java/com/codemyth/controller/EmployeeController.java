package com.codemyth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemyth.model.Employee;
import com.codemyth.repository.EmployeeRepository;


//we are using @RestController so that, application ko malum chal sake ki this is rest controller
//Or this @RestController will accept the path i.e. URL starting with '/api'
// @RequestParam annotation enables spring to extract input data that may be passed as a query, form data, or any arbitrary custom data. 


@RestController   
@RequestMapping("/api")
public class EmployeeController {
    
    @Autowired   // used for automatic dependency injection.
    EmployeeRepository employeeRepository;

    @PostMapping("/employees") // Specify the endpoint path
    public String createEmployee(@RequestBody Employee employee) {
    	
        // Your logic for creating an employee
        // You can use employeeRepository to save the employee to the database

//        return ResponseEntity.ok("Employee created successfully");
    	employeeRepository.save(employee);
		return "Employee created in Database";
    }
}

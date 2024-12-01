package com.codemyth.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	
	
	@Id       // this @id annotation indicate that the below mentioned information is primary
	@GeneratedValue(strategy = GenerationType.IDENTITY)    // strategy = GenerationType.IDENTITY will not allow to match the multiple value it will make it identical
	
	private long empid;  //primary key
	
	@Column(name="emp_name")  // @Colunm annotation is used to map the all attributes created [ emp_name, empid, emp_salary
//	                              emp_city, emp_age]  with the database column.
	private String emp_Name;
	
	@Column(name="emp_salary")
	private Float emp_salary;
	
	@Column(name="emp_age")
	private int emp_age;
	
	@Column(name="emp_city")
	private String emp_city;

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public Float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(Float emp_salary) {
		this.emp_salary = emp_salary;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public Employee(long empid, String emp_Name, Float emp_salary, int emp_age, String emp_city) {
		super();
		this.empid = empid;
		this.emp_Name = emp_Name;
		this.emp_salary = emp_salary;
		this.emp_age = emp_age;
		this.emp_city = emp_city;
	}
	
	
	public Employee() {
//		generate toString [ source--> Generate toString()
		
		
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emp_Name=" + emp_Name + ", emp_salary=" + emp_salary + ", emp_age="
				+ emp_age + ", emp_city=" + emp_city + "]";
	}
	
	


}

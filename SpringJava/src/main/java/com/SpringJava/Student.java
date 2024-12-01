package com.SpringJava;

public class Student {
	
//	we have created a beans named 'student' and we have taken three properties in student class (i.e. Id, Name, Address)
	private int studentId;
	private String studentName;
	public String studentAddress;
	public int getStudentId() {
		return studentId;
	}
	
	//getter and setter injection
	public void setStudentId(int studentId) {
		System.out.println("Setting Student Id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address");
		this.studentAddress = studentAddress;
	}
	
	//two constructors are initialize here
//	1.Parameterized constructor

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
//	2.Default constructor

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	
}



package com.kit.admissions;

public abstract class Student {
	private int studentId;
	private String name;
	private String gender;
	private String department;
	protected double collegeFee;
	private String category;
	public Student() {
		super();
	}
	
	public Student(int studentId, String name, String gender, String department, double collegeFee) {
		super();
		this.studentId=studentId;
		this.name=name;
		this.gender=gender;
		this.department=department;
		this.collegeFee=collegeFee;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getCollegeFee() {
		return collegeFee;
	}

	public void setCollegeFee(double collegeFee) {
		this.collegeFee = collegeFee;
	}
	
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public abstract double calculateTotalFee();
}

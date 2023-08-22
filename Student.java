package com.onesoft.question.revision;

public class Student {
	private int id;
	private String name;
	private int totalMarks;
	private String grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	Student(int id, String name, int totalMarks, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.totalMarks = totalMarks;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", totalMarks=" + totalMarks + ", grade=" + grade + "]";
	}
	

}

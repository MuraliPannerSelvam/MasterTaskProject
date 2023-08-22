package com.onesoft.question.revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeStudents {
	public static void main(String[] args) {
		Student s1=new Student(101, "Murali", 403, "A");
		Student s2=new Student(102, "Naveen", 430, "B");
		Student s3=new Student(103, "Gova", 428, "C");
		Student s4=new Student(104, "Harish", 456, "D");
		Student s5=new Student(105, "Gowtham", 445, "E");
		List<Student> list1=Arrays.asList(s1,s2,s3,s4,s5);
		
// SQL QUERY = SELECT * FROM student ORDER BY marks DESC LIMIT 0,3;
		List<Student> top3=list1.stream().sorted(Comparator.comparing(Student::getTotalMarks).reversed()).limit(3).collect(Collectors.toList());
		top3.forEach(x-> System.out.println(x));

		
		
		
	}

}

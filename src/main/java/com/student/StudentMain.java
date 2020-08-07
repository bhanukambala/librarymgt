package com.student;

import java.util.*;

public class StudentMain{
	private Set<Student> student=new HashSet<>();
	public static void main(String[] args) {
		StudentMain demo=new StudentMain();
		demo.runApp();
	}
		public void runApp() {	
		
		Student student1=new Student("b1",20);
		student.add(student1);
		Student student2=new Student("b2",24);
		student.add(student2);
		Student student3=new Student("b3",25);
		student.add(student3);
		List<Student> studentagedetails = new ArrayList<Student>(student);
		display(studentagedetails);
		}
		public void display(List<Student> studentagedetails) {
			for (Student studentage : studentagedetails ) {
				int age=studentage.getAge();
				if(age>21)
				{
				System.out.println(age);
			}
		}		
		}	
}



package com.student;

import java.util.*;

public class StudentMain{
		public static void main(String[] args) {
		StudentMain demo=new StudentMain();
		demo.runUi();
	}
		Set<Student> student=new HashSet<>();
		public void runUi() {
		student.add(new Student("b1",24));
		student.add(new Student("b2",23));

		List<Student> list=toList(student);
		}
		public List<Student> toList(Set<Student> student)  {
			List<Student> list= new ArrayList<>();
			for (Student studentage : student ) {
				if(studentage.getAge()>21)
				{
				list.add(studentage);
			}
		}
			return list;		
		}	
}



package com.student;

public class Student {
	private String rollno;
	private int age;
	public Student(String rollno,int age) {
		this.rollno=rollno;
		this.age=age;
	}
	public Student() {
		this("b1",21);
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return age;
	}
	@Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Student) ) {
			return false;
	   }
		
	    Student that=(Student)arg;	
		boolean isequal=this.age==that.age;
		return isequal;
	}
}

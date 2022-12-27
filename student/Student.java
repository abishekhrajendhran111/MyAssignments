package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Abishekh");
	}
	public void studentDept() {
		System.out.println("Mechanical");
	}
	public void studentId() {
		System.out.println("1812003");
	}

	public static void main(String[] args) {
		Student studentDetails=new Student();
		studentDetails.collegeName();
		studentDetails.collegecode();
		studentDetails.collegeRank();
		studentDetails.departmentName();
		studentDetails.studentName();
		studentDetails.studentId();
		studentDetails.studentDept();
	}

}

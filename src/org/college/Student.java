package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("student name : Hashika");
		}
	public void studentDept() {
		System.out.println("student dept : ECE");
	}
	public void studentId() {
		System.out.println("student id : EC123");
	}
	public static void main(String[] args) {
		Student data = new Student();
		data.studentName();
		data.studentDept();
		data.studentId();
		data.collegeName();
		data.collegeCode();
		data.collegeRank();
		data.deptName();
		data.HostelName();
	}
}
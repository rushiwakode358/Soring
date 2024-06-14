package com.xmlConfiguration;

public class Student {

	private int studentRoll;
	private String studentName;
	private String studentBranch;
	private String studentAddress;

	public Student() {
		super();
	}

	public Student(int studentRoll, String studentName, String studentBranch, String studentAddress) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", studentBranch="
				+ studentBranch + ", studentAddress=" + studentAddress + "]";
	}

}

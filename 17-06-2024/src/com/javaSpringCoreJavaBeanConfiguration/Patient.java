package com.javaSpringCoreJavaBeanConfiguration;

public class Patient {

	private int patientId;
	private String patientName;
	private String patientAddress;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAddress=" + patientAddress
				+ "]";
	}

}

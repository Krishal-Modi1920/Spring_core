package com.springcore.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // @ Component is used to mark the class as a spring bean (Stereotype)
public class Student {
	
	@Value("Krishal")
	private String studentName;
	
	@Value("Ahmedabad")
	private String city;
	
	@Value("#{temp}") //("#{}") anything can be written
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
}

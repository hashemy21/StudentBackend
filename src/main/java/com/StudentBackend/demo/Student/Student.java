package com.StudentBackend.demo.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Student {
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	private Long id;
	private String firstName;
	private String lastName;
	private String major;
	
	 
	public Student() {
	}

	public Student(String firstName, String lastName, String major) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
	}



	public Student(Long id, String firstName, String lastName, String major) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", major=" + major + "]";
	}
	
	
	 
	 
	 
	 
}

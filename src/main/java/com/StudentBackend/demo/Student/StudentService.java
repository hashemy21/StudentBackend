package com.StudentBackend.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@GetMapping
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public void deleteStudent(Long studentId) {
		
		if(!studentRepository.existsById(studentId)) {
			throw new IllegalStateException("this id does not exist");
		}
		studentRepository.deleteById(studentId);
		
	}
}

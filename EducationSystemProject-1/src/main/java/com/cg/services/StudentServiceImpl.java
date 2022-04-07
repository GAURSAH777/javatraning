package com.cg.services;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entities.Course;
import com.cg.entities.Student;

import com.cg.exception.CourseNotFoundException;

import com.cg.exception.RegistrationRequestNotApprovedException;
import com.cg.exception.StudentNotFoundException;

import com.cg.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> viewAllStudentDetails() {

		return studentRepository.findAll();
	}

	@Override
	public Student viewStudentById(int id)
			throws EntityNotFoundException, StudentNotFoundException, RegistrationRequestNotApprovedException {

		return studentRepository.getById(id);
	}

	@Override
	public Student updateStudentDetails(int id, Student student)
			throws EntityNotFoundException, StudentNotFoundException, RegistrationRequestNotApprovedException {

		return studentRepository.save(student);
	}

	@Override
	public Set<Course> viewCourseForStudent(int id) throws EntityNotFoundException, StudentNotFoundException,
			RegistrationRequestNotApprovedException, CourseNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return true;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}

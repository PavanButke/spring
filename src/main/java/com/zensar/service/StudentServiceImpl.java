package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	List<Student> students = new ArrayList<Student>();

	public StudentServiceImpl() {
		students.add(new Student(1, "Axs", 10));
		students.add(new Student(2, "sdaul", 12));
		students.add(new Student(3, "daob", 16));
	}


	@Override
	public Student student(int studentId) {
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return students;
	}

	@Override
	public void insertStudent(Student student) {
		students.add(student);
	}

	@Override
	public void updateStudent(int studentId, Student student) {
		Student student2 = student(studentId);
		student2.setStudentId(student.getStudentId());
		student2.setStudentName(student.getStudentName());
		student2.setStudentAge(student.getStudentAge());

		/* students.add(student2); */
	}

	@Override
	public void deleteStudent(int studentId) {
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getStudentId() == studentId) {

				students.remove(student);
			}
		}
		
	}

}

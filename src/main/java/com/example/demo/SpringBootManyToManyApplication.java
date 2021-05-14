package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Courses;
import com.example.demo.entity.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class SpringBootManyToManyApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootManyToManyApplication.class, args);
		System.out.println("Chandu Velagapudi");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("I am in run method");

		Set<Student> student = new HashSet<>();
		Set<Courses> courses = new HashSet();

		Courses courses2 = new Courses();
		courses2.setCourseName("java");
		Courses courses3 = new Courses();
		courses3.setCourseName("python");
		
		courses.add(courses2);
		courses.add(courses3);
		courseRepository.save(courses3);
		Student student2 = new Student();
		student2.setStudentName("chandu");
       student2.setCourses(courses);
		Student student3 = new Student();
		student3.setStudentName("vinod");
		 student2.setCourses(courses);
		 
		courses.add(courses2);
		courses.add(courses3); 
		
		student.add(student2);
		student.add(student3);

	

		//courses.setStudent(student);
	//	studentRepository.save(student2);	
    
    studentRepository.save(student2);
    
	}

}

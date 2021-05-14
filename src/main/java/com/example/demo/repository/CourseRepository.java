package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Serializable> {

}

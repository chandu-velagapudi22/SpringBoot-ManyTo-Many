package com.example.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Courses_Institute")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Courses implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String courseName;

	@ManyToMany(cascade = CascadeType.ALL, targetEntity = Student.class, fetch = FetchType.EAGER, mappedBy = "courses")
	private Set<Student> student = new HashSet<>();

}

package com.akshay.student.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.student.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

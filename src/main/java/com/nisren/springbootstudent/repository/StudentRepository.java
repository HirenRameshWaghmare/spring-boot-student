package com.nisren.springbootstudent.repository;

import com.nisren.springbootstudent.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    public Student findByName(String name);
}

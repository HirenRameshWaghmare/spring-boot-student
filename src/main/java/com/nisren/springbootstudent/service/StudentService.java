package com.nisren.springbootstudent.service;

import com.nisren.springbootstudent.entity.Student;
import com.nisren.springbootstudent.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    /**
     * FindAll
     * FindById
     * Save
     * SaveAll
     * Update
     * Delete
     */

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }


    public List<Student> saveAllStudents(List<Student> students){
        return studentRepository.saveAll(students);
    }

    public Student updateStudent( Student student){
        Student existingStudent = studentRepository.getById(student.getId());
        existingStudent.setId(student.getId());
        existingStudent.setName(student.getName());
        existingStudent.setSchool(student.getSchool());
        existingStudent.setSection(student.getSection());
        return studentRepository.save(existingStudent);

    }

    public String deleteStudent(int id){
         studentRepository.deleteById(id);
         return "Student with id "+id+" is deleted from database";
    }

    public Student findByName(String name){
        return studentRepository.findByName(name);
    }
}

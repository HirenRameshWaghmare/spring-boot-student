package com.nisren.springbootstudent.controller;

import com.nisren.springbootstudent.entity.Student;
import com.nisren.springbootstudent.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    /**
     * findAll
     * find
     * SaveAll
     * saveupdate
     * delete
     */

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.findAll();
    }

    @GetMapping("/getStudent/{id}")
    public Student getById(@PathVariable int id){
        return studentService.findById(id);
    }

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PostMapping("/saveAllStudents")
    public List<Student> saveAllStudents(@RequestBody List<Student> students){
        return studentService.saveAllStudents(students);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("/findName/{name}")
    public Student findByName(@PathVariable String name){
        return studentService.findByName(name);
    }

}

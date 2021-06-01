package com.example.demo.Services;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}

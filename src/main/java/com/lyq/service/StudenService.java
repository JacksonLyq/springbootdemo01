package com.lyq.service;

import com.lyq.enity.Student;

import java.util.List;

public interface StudenService {
    void insert(Student student);
    List<Student> selectAll();
    void update(Student student);
    Student selectStuById(String stuId);
}

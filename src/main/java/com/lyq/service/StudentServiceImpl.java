package com.lyq.service;

import com.lyq.enity.Student;
import com.lyq.mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudenService {

    /** 日志对象 **/
    private static final Logger logger = LoggerFactory.getLogger(StudenService.class);

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void insert(Student student) {
            studentMapper.insert(student);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.select();
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public Student selectStuById(String stuId) {
        return studentMapper.selectStuById(stuId);
    }
}

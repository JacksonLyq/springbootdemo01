package com.lyq.mapper;

import com.lyq.enity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    void insert(Student student);
    List<Student> select();
    void update(Student student);
    Student selectStuById(String stuId);

}

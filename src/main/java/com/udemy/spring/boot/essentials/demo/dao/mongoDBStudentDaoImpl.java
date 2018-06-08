package com.udemy.spring.boot.essentials.demo.dao;

import com.udemy.spring.boot.essentials.demo.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("mongoDBDao")
public class mongoDBStudentDaoImpl implements StudentDao {

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentIds) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(UUID.randomUUID(), 10, "mongo", "db", "one"));
        return students;
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return 0;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        return 0;
    }
}

package com.cordial.service;

import com.cordial.dao.StudentDAO;
import com.cordial.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public String insert(Map<String, String[]> requestMap) {

        String id = null;

        if(requestMap.size() > 0) {
            Student student = new Student();
            student.setId(System.currentTimeMillis());
            student.setStudentName(requestMap.get("student_name")[0]);
            student.setStudentClass(requestMap.get("student_class")[0]);
            student.setStudentSection(requestMap.get("student_section")[0]);

            id = studentDAO.insert(student);
        }

        return id;
    }

}

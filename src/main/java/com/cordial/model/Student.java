package com.cordial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class Student implements Serializable{

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "stuedent_class")
    private String studentClass;

    @Column(name = "student_section")
    private String studentSection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", studentSection='" + studentSection + '\'' +
                '}';
    }
}

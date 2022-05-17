package com.cordial.dao;

import com.cordial.model.Student;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public String insert(Student student) {
        String id = null;
        var session = sessionFactory.getCurrentSession();

        try {
            Long longId = (Long) session.save(student);
            id = longId.toString();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.flush();

        return id;
    }

    public List<Student> getAll(){
        var session = sessionFactory.getCurrentSession();
        String hqlQuery = "SELECT s FROM Student s";

        Query query = sessionFactory.getCurrentSession().createQuery(hqlQuery, Student.class);
        List<Student> studentList = query.list();

        return studentList;
    }
}

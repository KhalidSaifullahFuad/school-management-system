package com.cordial.dao;

import com.cordial.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public String insert(Student student) {
        String id = null;
        Session session = sessionFactory.getCurrentSession();

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
        String hqlQuery = "FROM Student";

        Query query = sessionFactory.getCurrentSession().createQuery(hqlQuery, Student.class);
        List<Student> studentList = query.list();

        return studentList;
    }
}

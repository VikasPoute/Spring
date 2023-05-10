package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.orm.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    HibernateTemplate template;

    @Override
    @Transactional
    public int insertStudent(Student student) {
        template.getSessionFactory().getCurrentSession().setHibernateFlushMode(FlushMode.COMMIT);
        template.save(student);
        return student.getStudentId();
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

}

package com.excel.spring_Hibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
    private HibernateTemplate hibernateTemplate;

    public void setTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    @Transactional
    public Integer insert(Student_1 s) {
        return (Integer) hibernateTemplate.save(s);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student_1 s = hibernateTemplate.get(Student_1.class, id);
        hibernateTemplate.delete(s);
    }

    @Override
    @Transactional
    public void delete(Student_1 s) {
        hibernateTemplate.delete(s);
    }

    @Override
    @Transactional
    public void update(Student_1 s) {
        hibernateTemplate.update(s);
    }

    @Override
    public Student_1 getStudent(int id) {
        return hibernateTemplate.get(Student_1.class, id);
    }

    @Override
    public List<Student_1> getAllStudents() {
        return hibernateTemplate.loadAll(Student_1.class);
    }

}
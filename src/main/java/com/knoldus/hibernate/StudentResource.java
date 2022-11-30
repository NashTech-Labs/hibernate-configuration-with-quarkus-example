package com.knoldus.hibernate;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

public class StudentResource {

    /**
     * Injecting Entity Manager
     */
    @Inject
    private EntityManager entityManager;

    /**
     * get students
     * @return list of students
     */
    public List<Student> getStudents() {
        List<Student> students = entityManager.createQuery(
                "Select std from student std", Student.class).getResultList();
        return students;
    }

    /**
     * persistStudent
     * @param student the student
     * @return student
     */
    public Student persistStudent(Student student){
        entityManager.persist(student);
        return student;
    }
}

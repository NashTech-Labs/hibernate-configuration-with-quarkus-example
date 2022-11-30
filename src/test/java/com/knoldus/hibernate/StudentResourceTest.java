package com.knoldus.hibernate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StudentResourceTest {

    @Test
    @Disabled("TODO: Complete this test")
    void testGetStudents() {
        (new StudentResource()).getStudents();
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testPersistStudent() {

        StudentResource studentResource = new StudentResource();

        Student student = new Student();
        student.setCourse("BCA");
        student.setFirstName("deepak");
        student.setId(123L);
        student.setLastName("kumar");
        student.setVersion(1);
        studentResource.persistStudent(student);
    }
}


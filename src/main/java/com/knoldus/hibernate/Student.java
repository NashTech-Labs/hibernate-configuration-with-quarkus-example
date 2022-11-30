package com.knoldus.hibernate;
import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(
            name = "student_seq", sequenceName = "student_seq")
    private Long id;
    private String firstName;
    private String lastName;
    private String course;
    @Version
    private int version;

    /**
     * Get Id
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * set Id
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getFirstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set First Name
     * @param firstName the firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get LastName
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set LastName
     * @param lastName the lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get Course
     * @return course
     */
    public String getCourse() {
        return course;
    }

    /**
     * set course
     * @param course the course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * get version
     * @return version
     */
    public int getVersion() {
        return version;
    }

    /**
     * set version
     * @param version the version
     */
    public void setVersion(int version) {
        this.version = version;
    }
}

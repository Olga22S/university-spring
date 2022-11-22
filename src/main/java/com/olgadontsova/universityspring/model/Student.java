package com.olgadontsova.universityspring.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Student {

    @Id
    @GeneratedValue
    Long pk;
    private String fullName;
    private int age;
    @OneToMany
    private List<StudentAssessment> studentAssessments;

    public Student() {
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<StudentAssessment> getStudentAssessments() {
        return studentAssessments;
    }

    public void setStudentAssessments(List<StudentAssessment> studentAssessments) {
        this.studentAssessments = studentAssessments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(pk, student.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "Student{" +
                "pk=" + pk +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", studentAssessments=" + studentAssessments +
                '}';
    }
}

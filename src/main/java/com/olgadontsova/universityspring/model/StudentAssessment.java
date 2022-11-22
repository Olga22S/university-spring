package com.olgadontsova.universityspring.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class StudentAssessment {

    @Id
    @GeneratedValue
    Long pk;
    private int course;
    private int semester;
    @OneToMany
    private List<DisciplineAssessment> assessments;

    public StudentAssessment() {
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public List<DisciplineAssessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<DisciplineAssessment> assessments) {
        this.assessments = assessments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentAssessment that = (StudentAssessment) o;
        return Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "StudentAssessment{" +
                "pk=" + pk +
                ", course=" + course +
                ", semester=" + semester +
                ", assessments=" + assessments +
                '}';
    }
}

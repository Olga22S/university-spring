package com.olgadontsova.universityspring.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Group {

    @Id
    @GeneratedValue
    Long pk;
    private String name;
    private int course;
    @OneToOne
    private Student elder;
    @OneToMany
    private List<Student> students;
    @OneToMany
    private List<Discipline> disciplines;

    public Group() {
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student getElder() {
        return elder;
    }

    public void setElder(Student elder) {
        this.elder = elder;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(pk, group.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "Group{" +
                "pk=" + pk +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", elder=" + elder +
                ", students=" + students +
                ", disciplines=" + disciplines +
                '}';
    }
}

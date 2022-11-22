package com.olgadontsova.universityspring.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Discipline {

    @Id
    @GeneratedValue
    Long pk;
    private String name;
    @OneToMany
    private List<Teacher> teachers;

    public Discipline() {
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

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "pk=" + pk +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
package com.olgadontsova.universityspring.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
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
    //

}

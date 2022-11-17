package com.olgadontsova.universityspring.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Discipline {

    @Id
    @GeneratedValue
    Long pk;

    @ManyToOne
    private Group group;
    private String name;
    @OneToMany
    private List<Teacher> teachers;
}
package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class Group {

    private String name;
    private int course;
    private Student elder;
    private List<Student> students;
    private List<Discipline> disciplines;
}

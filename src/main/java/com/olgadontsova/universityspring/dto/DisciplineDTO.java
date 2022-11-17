package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class Discipline {

    private String name;
    private List<Teacher> teachers;
}

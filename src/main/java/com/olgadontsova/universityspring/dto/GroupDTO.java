package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class GroupDTO {

    private String name;
    private int course;
    private StudentDTO elder;
    private List<StudentDTO> students;
    private List<DisciplineDTO> disciplines;
}

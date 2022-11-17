package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class DisciplineDTO {

    private String name;
    private List<TeacherDTO> teachers;
}

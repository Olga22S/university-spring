package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {

    private String fullName;
    private int age;
    private List<StudentAssessmentDTO> studentAssessments;
}

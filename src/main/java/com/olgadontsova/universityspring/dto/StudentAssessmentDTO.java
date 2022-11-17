package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class StudentAssessmentDTO {

    private int course;
    private int semester;
    private Map<DisciplineDTO, List<DisciplineAssessmentDTO>> assessments;
}

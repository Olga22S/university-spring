package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class DisciplineAssessmentDTO {

    private DisciplineDTO discipline;
    private List<Integer> scores;
    private int exam;
    private boolean isExam;
    private boolean noScoreExam;
}

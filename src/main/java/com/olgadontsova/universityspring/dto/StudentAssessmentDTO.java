package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class StudentAssessment {

    private Map<Discipline, List<DisciplineAssessment>> assessment;

    @Data
    class DisciplineAssessment{

        private int semester;
        private List<Integer> scores;
        private int exam;
        private boolean isExam;
        private boolean noScoreExam;
    }
}

package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DayScheduleDto {

    private String groupName;
    private LocalDate date;
    private List<DisciplineTimeScheduleDto> disciplineSchedules;
}

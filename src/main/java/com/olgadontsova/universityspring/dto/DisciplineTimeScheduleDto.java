package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class DisciplineTimeScheduleDto {

    private LocalTime time;
    private DisciplineDTO discipline;
}

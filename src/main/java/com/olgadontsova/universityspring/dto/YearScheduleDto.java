package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class YearScheduleDto {

    private int year;
    private List<MonthScheduleDto> monthSchedules;
}

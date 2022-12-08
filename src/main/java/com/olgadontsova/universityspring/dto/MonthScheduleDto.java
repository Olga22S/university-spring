package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.time.Month;
import java.util.List;

@Data
public class MonthScheduleDto {

    private Month month;
    private List<WeekScheduleDto> weekSchedules;
}

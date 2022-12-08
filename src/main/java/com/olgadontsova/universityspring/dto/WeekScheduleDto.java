package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class WeekScheduleDto {

    private LocalDate dateStart;
    private LocalDate dateEnd;
    private List<DayScheduleDto> daySchedules;
}

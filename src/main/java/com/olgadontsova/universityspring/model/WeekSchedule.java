package com.olgadontsova.universityspring.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class WeekSchedule {

    @Id
    @GeneratedValue
    Long pk;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    @OneToMany
    private List<DaySchedule> daySchedules;

    public WeekSchedule() {
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public List<DaySchedule> getDaySchedules() {
        return daySchedules;
    }

    public void setDaySchedules(List<DaySchedule> daySchedules) {
        this.daySchedules = daySchedules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeekSchedule that = (WeekSchedule) o;
        return Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "WeekSchedule{" +
                "pk=" + pk +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", daySchedules=" + daySchedules +
                '}';
    }
}
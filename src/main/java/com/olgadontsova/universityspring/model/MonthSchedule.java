package com.olgadontsova.universityspring.model;

import com.olgadontsova.universityspring.dto.WeekScheduleDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.Month;
import java.util.List;
import java.util.Objects;

@Entity
public class MonthSchedule {

    @Id
    @GeneratedValue
    Long pk;
    private Month month;
    @OneToMany
    private List<WeekSchedule> weekSchedules = new java.util.ArrayList<>();

    public MonthSchedule() {
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public List<WeekSchedule> getWeekSchedules() {
        return weekSchedules;
    }

    public void setWeekSchedules(List<WeekSchedule> weekSchedules) {
        this.weekSchedules = weekSchedules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthSchedule that = (MonthSchedule) o;
        return Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "MonthSchedule{" +
                "pk=" + pk +
                ", month=" + month +
                ", weekSchedules=" + weekSchedules +
                '}';
    }
}

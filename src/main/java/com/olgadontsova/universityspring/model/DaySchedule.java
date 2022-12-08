package com.olgadontsova.universityspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class DaySchedule {

    @Id
    @GeneratedValue
    Long pk;
    private String groupName;
    private LocalDate date;
    @OneToMany
    private List<DisciplineTimeSchedule> disciplineSchedules;

    public DaySchedule() {
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<DisciplineTimeSchedule> getDisciplineSchedules() {
        return disciplineSchedules;
    }

    public void setDisciplineSchedules(List<DisciplineTimeSchedule> disciplineSchedules) {
        this.disciplineSchedules = disciplineSchedules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "pk=" + pk +
                ", groupName='" + groupName + '\'' +
                ", date=" + date +
                ", disciplineSchedules=" + disciplineSchedules +
                '}';
    }
}

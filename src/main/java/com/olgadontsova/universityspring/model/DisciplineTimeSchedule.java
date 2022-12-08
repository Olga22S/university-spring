package com.olgadontsova.universityspring.model;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Objects;

@Entity
public class DisciplineTimeSchedule {

    @Id
    @GeneratedValue
    Long pk;
    private LocalTime time;
    @ManyToOne
    private Discipline discipline;

    public DisciplineTimeSchedule() {
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineTimeSchedule that = (DisciplineTimeSchedule) o;
        return Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "DisciplineTimeSchedule{" +
                "pk=" + pk +
                ", time=" + time +
                ", discipline=" + discipline +
                '}';
    }
}

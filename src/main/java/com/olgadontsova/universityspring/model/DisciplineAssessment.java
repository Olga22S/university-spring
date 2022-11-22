package com.olgadontsova.universityspring.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class DisciplineAssessment {

    @Id
    @GeneratedValue
    Long pk;
    @OneToOne
    private Discipline discipline;
    @ElementCollection
    private List<Integer> scores;
    private int exam;
    private boolean isExam;
    private boolean noScoreExam;

    public DisciplineAssessment() {
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public boolean isExam() {
        return isExam;
    }

    public void setExam(boolean exam) {
        isExam = exam;
    }

    public boolean isNoScoreExam() {
        return noScoreExam;
    }

    public void setNoScoreExam(boolean noScoreExam) {
        this.noScoreExam = noScoreExam;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineAssessment that = (DisciplineAssessment) o;
        return Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "DisciplineAssessment{" +
                "pk=" + pk +
                ", discipline=" + discipline +
                ", scores=" + scores +
                ", exam=" + exam +
                ", isExam=" + isExam +
                ", noScoreExam=" + noScoreExam +
                '}';
    }
}

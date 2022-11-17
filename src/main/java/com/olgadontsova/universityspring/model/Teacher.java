package com.olgadontsova.universityspring.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue
    Long pk;
    private String fullName;
}

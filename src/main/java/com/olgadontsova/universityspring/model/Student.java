package com.olgadontsova.universityspring.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    Long pk;
    private String fullName;
    private int age;
}

package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class Faculty {

    private String name;
    private Teacher dean;
    private List<Group> groups;
}

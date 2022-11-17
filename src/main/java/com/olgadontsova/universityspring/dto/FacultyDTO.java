package com.olgadontsova.universityspring.dto;

import lombok.Data;

import java.util.List;

@Data
public class FacultyDTO {

    private String name;
    private TeacherDTO dean;
    private List<GroupDTO> groups;
}

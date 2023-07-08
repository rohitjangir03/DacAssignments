package com.app.dto;

import com.app.entities.CoursesEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponseDto {
     private String firstName;
     private String lastName;
     private String email;
     private CoursesEnum title;
     private int score;
   
}


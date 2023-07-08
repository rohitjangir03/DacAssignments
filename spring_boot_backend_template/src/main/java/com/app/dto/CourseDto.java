package com.app.dto;

import java.time.LocalDate;

import com.app.entities.CoursesEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
	private CoursesEnum title;
	private LocalDate startDate;
	private LocalDate endDate;
	private double fees;
	private int minScore;
}

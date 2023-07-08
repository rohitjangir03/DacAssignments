package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.CourseDto;
import com.app.entities.Courses;

public interface CoursesService {
	List<CourseDto> getAllCourses();
	ApiResponse addCourse(CourseDto cdto);
	ApiResponse deleteCourse(Long id);
	ApiResponse updateCourse(Long id, double fees);
	Courses getById(Long id);
}
	
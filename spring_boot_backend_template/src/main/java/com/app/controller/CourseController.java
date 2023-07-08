package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CourseDto;
import com.app.service.CoursesService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CoursesService courseServ;
	
	@GetMapping()
	public ResponseEntity<?> getAllCourses(){
		return ResponseEntity.status(HttpStatus.OK).body(courseServ.getAllCourses());
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addCourse(@RequestBody CourseDto dto){
		return ResponseEntity.status(HttpStatus.OK).body(courseServ.addCourse(dto));
	}
	
	@DeleteMapping()
	public ResponseEntity<?> deleteCourse(Long id){
		return ResponseEntity.status(HttpStatus.OK).body(courseServ.deleteCourse(id));
	}
	
	@PutMapping()
	public ResponseEntity<?> updateCourse(@RequestBody Long id, double fees){
		return ResponseEntity.status(HttpStatus.OK).body(courseServ.updateCourse(id, fees));
	}
}

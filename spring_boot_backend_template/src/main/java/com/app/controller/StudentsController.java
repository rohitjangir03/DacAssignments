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

import com.app.dto.StudentDto;
import com.app.service.StudentsService;

@RestController
@RequestMapping("/student")
public class StudentsController {
     @Autowired
	public StudentsService studService;
	
     @GetMapping()
 	public ResponseEntity<?> getAllStudents(){
 		return ResponseEntity.status(HttpStatus.OK).body(studService.getAllStudents());
 	}
 	
 	@PostMapping("/add")
 	public ResponseEntity<?> addStudent(@RequestBody StudentDto dto){
 		return ResponseEntity.status(HttpStatus.OK).body(studService.addStudent(dto));
 	}
 	
 	@DeleteMapping()
 	public ResponseEntity<?> deleteStudent(Long id){
 		return ResponseEntity.status(HttpStatus.OK).body(studService.deleteStudent(id));
 	}
 	
 	@PutMapping()
 	public ResponseEntity<?> updateLastName(@RequestBody Long id, String lastName){
 		return ResponseEntity.status(HttpStatus.OK).body(studService.updateLastName(id, lastName));
 	}
}

package com.app.service;
import java.util.List;

import com.app.dto.*;
public interface StudentsService {
    List<StudentResponseDto> getAllStudents();
    ApiResponse addStudent(StudentDto sdto);
    ApiResponse deleteStudent(Long id);
    ApiResponse updateLastName(Long id,String lastName);
}

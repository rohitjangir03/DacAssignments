package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.dto.StudentDto;
import com.app.dto.StudentResponseDto;
import com.app.entities.Students;
import com.app.exception.customException;
import com.app.repo.CoursesRepository;
import com.app.repo.StudentsRepository;
@Service
@Transactional
public class StudentsServiceImpl implements StudentsService{
    @Autowired
	private StudentsRepository studRepo;
    @Autowired
    private ModelMapper mapper;
    
    @Autowired
    private CoursesRepository courRepo;
	
	@Override
	public List<StudentResponseDto> getAllStudents() {
		List<Students> list = studRepo.findAll();
		List<StudentResponseDto> s1 = new ArrayList<>();
		list.forEach((v)->s1.add(mapper.map(v, StudentResponseDto.class)));
		return s1;
	}

	@Override
	public ApiResponse addStudent(StudentDto sdto) {
		Students s = new Students(sdto.getFirstName(), sdto.getLastName(), sdto.getEmail(), sdto.getTitle(), sdto.getScore());
		courRepo.findById(sdto.getCourse_id()).map((course)->{
		s.setCourse(course);
		return studRepo.save(s);
		}).orElseThrow(()->new customException("courseid not found"));
		return new ApiResponse("student addded");
	}

	@Override
	public ApiResponse deleteStudent(Long id) {
		if(studRepo.existsById(id)) {
		studRepo.deleteById(id);
		}
		else {
			return new ApiResponse("id not found");
		}
		return new ApiResponse("student data deleted");
	}

	@Override
	public ApiResponse updateLastName(Long id, String lastName) {
		Students s = studRepo.findById(id).orElseThrow(()-> new customException("id not found"));
		s.setLastName(lastName);
		studRepo.save(s);
		return new ApiResponse("lastName updated success");
	}

}

package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.dto.CourseDto;
import com.app.entities.Courses;
import com.app.exception.customException;
import com.app.repo.CoursesRepository;
@Service
@Transactional
public class CoursesServiceImpl implements CoursesService{
   @Autowired
	private CoursesRepository courseRepo;
   
   @Autowired
   private ModelMapper mapper;
   
	@Override
	public List<CourseDto> getAllCourses() {
		List<Courses> list = courseRepo.findAll();
		List<CourseDto> c1 = new ArrayList<>();
		list.forEach((v->c1.add(mapper.map(v, CourseDto.class))));
		return c1;
	}

	@Override
	public ApiResponse addCourse(CourseDto cdto) {
		Courses c = new Courses(cdto.getTitle(),cdto.getStartDate(),cdto.getEndDate(),cdto.getFees(),cdto.getMinScore());
		courseRepo.save(c);
		return new ApiResponse("Course added");
	}

	@Override
	public ApiResponse deleteCourse(Long id) {
		if(courseRepo.existsById(id)) {
			courseRepo.deleteById(id);
		}
		else {
			return new ApiResponse("id not found");
		}
		return new ApiResponse("Emp deleted "+id);
	}

	@Override
	public ApiResponse updateCourse(Long id, double fees) {
		Courses c = courseRepo.findById(id).orElseThrow(()-> new customException("id not found"));
		c.setFees(fees);
		courseRepo.save(c);
		return new  ApiResponse("fees updated");
	}

	
	
	@Override
	public Courses getById(Long id) {
		Courses c = courseRepo.findById(id).orElseThrow(()->new customException("if npt found"));
	
		return c;
	}
       
}

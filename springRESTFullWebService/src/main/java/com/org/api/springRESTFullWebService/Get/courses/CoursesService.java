package com.org.api.springRESTFullWebService.Get.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {

	@Autowired
	private CoursesRepository coursesRepo;
	
	public List<Courses> getAllcoursess(String topicId){
		List<Courses> coursess=new ArrayList<>();
		coursesRepo.findByTopicId(topicId).forEach(coursess::add);
		return coursess;
	}
	
	public Courses getCourses(String id){
		return coursesRepo.findOne(id);
	}

	public void addCourses(Courses courses) {
		this.coursesRepo.save(courses);
	}

	public void updatecourses(Courses courses2) {
		coursesRepo.save(courses2);
	}

	public void deletecourses(String id) {
		coursesRepo.delete(id);
		
	}
}

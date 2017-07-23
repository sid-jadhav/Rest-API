package com.org.api.springRESTFullWebService.Get.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.api.springRESTFullWebService.Get.Hello.Topic;

@RestController 
public class CoursesController{
	
	@Autowired
	private CoursesService courseService;
	//Get is default type
	@RequestMapping("/topics/{id}/cources")
	public List<Courses> getAllCourses(@PathVariable String id){
		return courseService.getAllcoursess(id);
	}
	@RequestMapping("/topics/{topicId}/cources/{id}")
	public Courses getCourses(@PathVariable String id){
		return courseService.getCourses(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/cources")
	public List<Courses> addCourses(@RequestBody Courses courses,@PathVariable String topicId){
		courses.setTopic(new Topic (topicId,"",""));
		courseService.addCourses(courses);
		return courseService.getAllcoursess(topicId);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/cources/{id}")
	public List<Courses> updateCourses(@RequestBody Courses courses, @PathVariable String topicId){
		courses.setTopic(new Topic(topicId,"",""));
		courseService.updatecourses(courses);
		return courseService.getAllcoursess(topicId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
	public List<Courses> deleteCourses(@PathVariable String topicId,@PathVariable String id){
		courseService.deletecourses(id);
		return courseService.getAllcoursess(topicId);
	}
}

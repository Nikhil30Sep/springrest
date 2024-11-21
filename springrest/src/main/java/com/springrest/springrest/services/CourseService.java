package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.course;

public interface CourseService {
	
	public List<course> getCourses();
	
	public course getCourses(long courseId);
	
	public  course postCourse(course Course);
	
}

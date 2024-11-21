package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.course;

@Service
public class CourseServiceimpl implements CourseService {

	List<course> list;
	
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new course(145,"Java","this contain basics java"));
		list.add(new course(4343,"spring boot","this contains all concepts of sb"));
	}
	
	@Override
	public List<course> getCourses() {
		return list;
	}

	@Override
	public course getCourses(long courseId) {
		course c = null;
		for(course Course : list) {
			if(Course.getId()==courseId) {
				c = Course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public course postCourse(course Course) {
		list.add(Course);
		return Course;
	}
	

}

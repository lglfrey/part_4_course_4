package com.example.communications_prac.repo;

import com.example.communications_prac.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
    Course findCourseByName(String name);
}

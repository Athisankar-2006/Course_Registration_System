package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo  extends JpaRepository<Course,String> {

}

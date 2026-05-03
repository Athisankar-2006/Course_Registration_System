package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Repository.CourseRegistryRepo;
import com.example.Course.Registration.System.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courserepo;


    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {
   return courserepo.findAll();
    }


    public List<CourseRegistry> entrolledstudent() {
        return courseRegistryRepo.findAll();
    }

    public void registerStudent(String name, String emailId, String courseName) {

        CourseRegistry cr=new CourseRegistry(name,emailId,courseName);

        cr.setCourseName(courseName);
        cr.setName(name);
        cr.setEmailId(emailId);
        courseRegistryRepo.save(cr);
    }
}

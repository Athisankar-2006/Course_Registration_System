package com.example.Course.Registration.System.Controller;
import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CoursesController {

    @Autowired
    CourseService courseService;


    @GetMapping("/courses")
    public List<Course> availableCourse(){
       return courseService.availableCourses();
    }


    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> entrolledstudent(){
        return courseService.entrolledstudent();
    }

    @PostMapping("/courses/register")
    public String registerStudent(@RequestParam("name") String name,
                                  @RequestParam("emailId") String emailId,
                                  @RequestParam("courseName") String courseName){

        courseService.registerStudent(name,emailId,courseName);
        return "congratulations !" +name+" enrollment successful for !"+courseName;
    }

}

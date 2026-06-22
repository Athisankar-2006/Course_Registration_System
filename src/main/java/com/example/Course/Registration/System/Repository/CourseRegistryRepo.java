package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}

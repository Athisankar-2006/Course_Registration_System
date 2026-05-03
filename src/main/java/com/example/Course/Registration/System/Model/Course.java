package com.example.Course.Registration.System.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Course {
    @Id
    private String courseId;
    private String courseName;
    private String trainer;
    private int durationTime;

    public Course() {

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }

    public Course(String courseId, String courseName, String trainer, int durationTime) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.trainer = trainer;
        this.durationTime = durationTime;
    }
}

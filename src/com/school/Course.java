package com.school;

public class Course {
    private String courseId;
    private String courseName;

    public void setDetails(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
    }
}

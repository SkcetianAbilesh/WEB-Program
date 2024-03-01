package com.example.q2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    int courseId;
    String courseName;
    int creditHours;
    String instructor;
    String preRequisites;
    int maxCapacity;
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public String getPreRequisites() {
        return preRequisites;
    }
    public void setPreRequisites(String preRequisites) {
        this.preRequisites = preRequisites;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public String getEnrolledStudent() {
        return enrolledStudent;
    }
    public void setEnrolledStudent(String enrolledStudent) {
        this.enrolledStudent = enrolledStudent;
    }
    String enrolledStudent;
}

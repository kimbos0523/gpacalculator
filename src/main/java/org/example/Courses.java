package org.example;

import java.util.List;

public class Courses {
    private final List<Course> courses;
    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGPA() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGPA)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}

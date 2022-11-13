package org.example;

import java.text.DecimalFormat;
import java.util.List;

public class GPACalculator {
    private final Courses courses;

    public GPACalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GPACalculator(Courses courses) {
        this.courses = courses;
    }

    public double calculateGPA() {
        // Sum of (Credit * Course GPA)
        double totalMultipliedCreditAndCourseGPA = courses.multiplyCreditAndCourseGPA();

        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return Math.round((totalMultipliedCreditAndCourseGPA / totalCompletedCredit) * 100.0) / 100.0;
    }
}

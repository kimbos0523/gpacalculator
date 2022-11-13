package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Requirements:
 * Average gpa calculation method = (Sum (hours * GPA)) / (Total hours)
 * Use first class collection
 */
public class GPACalculatorTest {
    // GPA calculator domain: Courses, GPA calculator
    // OOD, Discrete Structure, First-year Writing --> implement in class (Course)

    /**
     * Key Point
     */
    // Send taken courses to calculate GPA ---> GPA Calculator ---> (Sum (hours * GPA)) ---> Course
    //                                                         ---> (Total hours)       ---> Course

    @DisplayName("Calculate GPA")
    @Test
    void calculateGPATest() {
        List<Course> courses = List.of(new Course("OOD", 4, "B+"),
                new Course("Discrete Structure", 4, "A"));

        GPACalculator gpaCalculator = new GPACalculator(new Courses(courses));
        double gpaResult = gpaCalculator.calculateGPA();

        assertThat(gpaResult).isEqualTo(3.67);
    }
}

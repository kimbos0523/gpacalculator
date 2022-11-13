package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {

    @DisplayName("Generate Course")
    @Test
    void createTest() {
        assertThatCode(() -> new Course("OOD", 3, "A"))
                .doesNotThrowAnyException();

    }
}

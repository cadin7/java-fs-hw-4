package ro.fasttrackit.hw4.student.service;

import ro.fasttrackit.hw4.student.model.Course;

import java.util.List;

import static java.lang.String.valueOf;
import static java.util.concurrent.ThreadLocalRandom.current;

public class CourseService {

    private static final List<String> COURSES = List.of("Math", "Geography", "Biology", "Astrology");

    public Course getRandomCourse() {
        return new Course(generateCourse(), generateSemester());
    }

    private String generateCourse() {
        return generateCourseName() + " " + generateCourseNumber();
    }

    private String generateCourseName() {
        final var randomInt = current().nextInt(0, 4);

        return COURSES.get(randomInt);
    }

    private String generateCourseNumber() {
        return valueOf(current().nextInt(100, 105));
    }

    private int generateSemester() {
        return current().nextInt(1, 5);
    }
}

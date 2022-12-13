package ro.fasttrackit.hw4.student.service;

import ro.fasttrackit.hw4.student.model.Student;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.String.format;
import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.*;

public record StudentService(List<Student> students) {

    private static final String AVG_GRADE = " %s have an average grade of %.2f";
    private static final String COURSE_JSON = """
            %s will participate to course
            {
            "course": "%s",
            "semester": %d
            }
            """;

    public String getAvgGrades() {
        return students.stream()
                .collect(teeing(
                        mapping(Student::name, joining(", ")),
                        averagingDouble(Student::grade),
                        (name, avg) -> format(AVG_GRADE, name, avg)));
    }

    public String generateCourse() {
        return students.stream()
                .map(this::generateCourse)
                .collect(joining(lineSeparator()));
    }

    public String generateGrades() {
        final var index = new AtomicInteger(0);

        return students.stream()
                .map(student -> generateGrade(student, index.getAndIncrement()))
                .collect(joining(lineSeparator()));
    }

    private String generateCourse(Student student) {
        final var randomCourse = new CourseService().getRandomCourse();

        return COURSE_JSON.formatted(student.name(), randomCourse.course(), randomCourse.semester());
    }

    private String generateGrade(Student student, int index) {
        return switch (index) {
            case 0, 1, 2 -> student.name() + ": 1st grade";
            case 3 -> student.name() + ": 4th grade";
            default -> student.name() + ": 7th grade";
        };
    }
}

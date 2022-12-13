package ro.fasttrackit.hw4.student;

import ro.fasttrackit.hw4.student.model.Student;
import ro.fasttrackit.hw4.student.service.StudentService;

import java.time.LocalDate;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        final var axel = new Student("Axel", LocalDate.of(1998, 10, 3), 4);
        final var laura = new Student("Laura", LocalDate.of(1988, 7, 23), 1);
        final var ralph = new Student("Ralph", LocalDate.of(1999, 3, 15), 2);
        final var edwin = new Student("Edwin", LocalDate.of(2000, 6, 2), 5);
        final var betty = new Student("Betty", 22, 3);
        final var george = new Student("George", 19, 5);
        final var michael = new Student("Michael", 20, 5);

        final var studentService = new StudentService(List.of(axel, laura, ralph, edwin, betty, george, michael));

        System.out.println("-----AVG Grades-----");
        System.out.println(studentService.getAvgGrades());

        System.out.println("\n-----Generated courses-----");
        System.out.println(studentService.generateCourse());

        System.out.println("-----Generated grades-----");
        System.out.println(studentService.generateGrades());

        System.out.println("\n-----Ages-----");
        System.out.println(betty.getAge());
        System.out.println(george.getAge());
        System.out.println(michael.getAge());
    }
}

package ro.fasttrackit.hw4.student.model;

import java.time.LocalDate;

import static java.time.LocalDate.now;
import static java.time.Period.between;
import static java.util.concurrent.ThreadLocalRandom.current;

public record Student(String name, LocalDate birthDate, int grade) {

    public Student(String name, int age, int grade) {
        this(name, getRandomBirthDate(age), grade);
    }

    public int getAge() {
        return between(birthDate, now()).getYears();
    }

    private static LocalDate getRandomBirthDate(long age) {
        final var startYear = now().minusYears(age + 1).getYear();
        final var maximumPlusDays = getMaximumPlusDays(startYear);

        return now().minusYears(age + 1).plusDays(getRandomDays(maximumPlusDays));
    }

    private static int getMaximumPlusDays(int startYear) {
        return startYear % 4 == 0 || (startYear + 1) % 4 == 0 ? 366 : 365;
    }

    private static int getRandomDays(int maximumPlusDays) {
        return current().nextInt(1, maximumPlusDays);
    }
}

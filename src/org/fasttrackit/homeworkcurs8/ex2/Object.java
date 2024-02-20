package org.fasttrackit.homeworkcurs8.ex2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

public class Object {
    Employee employee = new Employee();
    Programmer programmer = new Programmer();
    DatabaseAdmin databaseAdmin = new DatabaseAdmin();

    public String getFullName() {
        return employee.getLastName() + " " + employee.getFirstName();
    }

    public String getAge() {
        // return Period.between(LocalDateTime.now(), employee.getBirthday());
        LocalDateTime actualTime = LocalDateTime.now();
        Period period = getPeriod(employee.getBirthday(), actualTime);
        return period.getYears() + " years";
    }

    private static Period getPeriod(LocalDateTime birthday, LocalDateTime now) {
        return Period.between(birthday.toLocalDate(), now.toLocalDate());
    }
}

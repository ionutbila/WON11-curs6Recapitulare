package org.fasttrackit.homeworkcurs10;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentGradeList {
    public List<StudentGrade> readingTheStudents() throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        List<StudentGrade> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files/grades.txt"));
        String x = "";
        while (scanner.hasNext()) {
            x = scanner.nextLine();
            lines.add(x);
        }
        for (int i = 0; i < lines.size(); i++) {
            String[] tokens = lines.get(i).split("\\|");
            String[] nameAndSurname = tokens[0].split(" ");
            if (tokens.length == 2) {
                System.out.println("There is no grade for student: " + tokens[0]);
            } else if (tokens.length == 3) {
                if (nameAndSurname.length == 2) {
                    students.add(new StudentGrade(nameAndSurname[0], tokens[1], Integer.parseInt(tokens[2])));
                } else if (nameAndSurname.length == 1) {
                    System.out.println("The student: " + tokens[0] + " has only a name/ surname");
                    students.add(new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
                } else if (nameAndSurname.length > 2) {
                    System.out.println("The student: " + nameAndSurname[0] + " has multiple surnames. Full name is: " + tokens[0]);
                    students.add(new StudentGrade(nameAndSurname[0], tokens[1], Integer.parseInt(tokens[2])));
                }
            }
        }
        return students;
    }
}
package org.fasttrackit.homeworkcurs11;

import org.fasttrackit.homework.StudentGrade;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {

    Map<String, Integer> listOfStudents = new HashMap<String, Integer>();

    public void printStudents() {
        System.out.println(listOfStudents);
    }

    public String highestGrade() {
        String index = null;
        int max = 0;
        for (String i : listOfStudents.keySet()) {
            if (listOfStudents.get(i) > max) {
                max = listOfStudents.get(i);
                index = i;
            }
        }
        return index;
    }
}
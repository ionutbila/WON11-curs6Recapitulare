package org.fasttrackit.homeworkcurs10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentGradeList student = new StudentGradeList();
       // StudentGrade st = new StudentGrade("john", "math", 5);
        // System.out.println(student.readingTheStudents());
        //System.out.println(st.getDiscipline());
       // System.out.println(student.readingTheStudents());

        Classroom c = new Classroom();
       //  System.out.println(c.getTheList());
         //System.out.println(c.getGradesForDiscipline("Physics"));
        //System.out.println(c.getGradesForStudent(" Ermingard"));
       // System.out.println(c.getMaxGrade("Mathematics"));
        //System.out.println(c.getMaxGrade());
        //System.out.println(c.getAverageGrade("Physics"));
        // System.out.println(c.getWorstGrade("Computer Science"));


       // ReportGenerator r=new ReportGenerator();
        //r.generateReport();
       // System.out.println(r.getWorstGrade());
    }
}

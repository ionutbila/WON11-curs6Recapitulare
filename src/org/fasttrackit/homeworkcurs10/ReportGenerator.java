package org.fasttrackit.homeworkcurs10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReportGenerator {
    public List<StudentGrade> getTheList() throws FileNotFoundException {
        StudentGradeList s = new StudentGradeList();
        return s.readingTheStudents();
    }
    public void generateReport() throws IOException {
        Classroom c=new Classroom();
        BufferedWriter writer=new BufferedWriter(new FileWriter("files/grade-reports.out"));
        writer.write("Cea mai mare nota: "+c.getMaxGrade().getName()+" "+c.getMaxGrade().getGrade());
        writer.newLine();
        writer.write("Nota medie: "+getAverageGrade());
        writer.newLine();
        writer.write("Cea mai mica nota: "+getWorstGrade().getName()+" "+getWorstGrade().getGrade());
        writer.newLine();
        writer.flush();
    }

    public Integer getAverageGrade() throws FileNotFoundException {
        int sumOfGrades=0;
        int count=0;
        for(int i=0; i<getTheList().size();i++){
            sumOfGrades+=getTheList().get(i).getGrade();
            count++;
        }
        return sumOfGrades/count;
    }

    public StudentGrade getWorstGrade() throws FileNotFoundException {
        int minGrade=getTheList().get(0).getGrade();
        int minIndex=0;
        for(int i=1; i<getTheList().size();i++){
            int grade2=getTheList().get(i).getGrade();
            int grade=Math.min(minGrade, grade2);
            if(grade<minGrade){
                minGrade=grade;
                minIndex=i;
            }
        }
        return getTheList().get(minIndex);
    }
}
package org.fasttrackit.homeworkcurs10;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Iterator;


public class Classroom {

    public List<StudentGrade> getTheList() throws FileNotFoundException {
        StudentGradeList list = new StudentGradeList();
        //listStudents=list.readingTheStudents();
        return list.readingTheStudents();
    }


    public List<Integer> getGradesForDiscipline(String discipline) throws FileNotFoundException {
        List<Integer> listGradesForDiscipline = new ArrayList<>();
        // Iterator i=getTheList().iterator();
        for (int i = 0; i < getTheList().size(); i++) {
            if ((getTheList().get(i).getDiscipline()).equals(discipline)) {
                listGradesForDiscipline.add(getTheList().get(i).getGrade());
            }
        }
        return listGradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String student) throws FileNotFoundException {
        List<Integer> listGradesForStudent = new ArrayList<>();
        for (int i = 0; i < getTheList().size(); i++) {
            String[] tokens = getTheList().get(i).getName().split(" ");
            if (student.toLowerCase().trim().equals(getTheList().get(i).getName().toLowerCase()) ) {
                listGradesForStudent.add(getTheList().get(i).getGrade());
            }
        }
        return listGradesForStudent;
    }

    public StudentGrade getMaxGrade(String discipline) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < getTheList().size(); i++) {
            if (getTheList().get(i).getDiscipline().equals(discipline)) {
                list.add(i);
            }
        }
        int maxIndex = 0;
        int maxGrade = getTheList().get(list.get(0)).getGrade();
        for (int i = 1; i < list.size(); i++) {
            if (i < list.size() - 1) {
                int grade2 = getTheList().get(list.get(i)).getGrade();
                int grade = Math.max(maxGrade, grade2);
                if (grade > maxGrade) {
                    maxGrade = grade;
                    maxIndex = i;
                }
            }
        }
        return getTheList().get(list.get(maxIndex));
    }

    public StudentGrade getMaxGrade() throws FileNotFoundException {
        int maxIndex = 0;
        int maxGrade = getTheList().get(0).getGrade();
        for (int i = 0; i < getTheList().size(); i++) {
            int grade2 = getTheList().get(i).getGrade();
            int grade = Math.max(maxGrade, grade2);
            if (grade > maxGrade) {
                maxGrade = grade2;
                maxIndex = i;
            }
        }
        return getTheList().get(maxIndex);
    }

    public Integer getAverageGrade(String discipline) throws FileNotFoundException {
        int sumOfGrades = 0;
        int count = 0;
        for (int i = 0; i < getTheList().size(); i++) {
            if (getTheList().get(i).getDiscipline().equals(discipline)) {
                sumOfGrades += getTheList().get(i).getGrade();
                count++;
            }
        }
        return sumOfGrades / count;
    }

    public StudentGrade getWorstGrade(String discipline) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < getTheList().size(); i++) {
            if (getTheList().get(i).getDiscipline().equals(discipline)) {
                list.add(i);
            }
        }
        int minIndex = 0;
        int minGrade = getTheList().get(list.get(0)).getGrade();
        for (int i = 1; i < list.size(); i++) {
            int grade2 = getTheList().get(list.get(i)).getGrade();
            int grade = Math.min(minGrade, grade2);
            if (grade < minGrade) {
                minGrade = grade;
                minIndex = i;
            }
        }
        return getTheList().get(list.get(minIndex));
    }
}

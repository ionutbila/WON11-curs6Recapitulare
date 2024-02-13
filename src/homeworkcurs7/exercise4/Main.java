package homeworkcurs7.exercise4;

import static homeworkcurs7.exercise4.Student.averageGrade;
import static homeworkcurs7.exercise4.Student.numberOfStudents;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 8);
        Student student1 = new Student("Vasile", 9);

//        System.out.println(numberOfStudents);

        System.out.println(averageGrade());

//        System.out.println(student.getGrade());
//       System.out.println(student1.getGrade());
    }
}

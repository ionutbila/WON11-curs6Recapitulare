package homeworkcurs7.exercise4;

public class Student {
    private String name;
    private int grade;
    public static double sumOfTheGrades;
    public static int numberOfStudents;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        sumOfTheGrades += grade;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static double averageGrade() {
        double average = sumOfTheGrades / numberOfStudents;
        return average;
    }
}

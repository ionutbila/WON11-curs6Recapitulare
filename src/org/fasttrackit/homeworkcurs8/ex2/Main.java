package org.fasttrackit.homeworkcurs8.ex2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Programmer programmer = new Programmer();
        DatabaseAdmin dataBaseAdmin = new DatabaseAdmin();

        Object obj = new Object();
        System.out.println( obj.getFullName());
        System.out.println(obj.getAge());

    }
}

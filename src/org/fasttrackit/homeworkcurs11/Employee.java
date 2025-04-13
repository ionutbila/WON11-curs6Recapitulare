package org.fasttrackit.homeworkcurs11;

public class Employee extends Person {
    private final String company;
    private final int salary;

    Employee(String name, int age, String hairColor, String company, int salary){
        this.company=company;
        this.salary=salary;
    }

    public String getCompany(){
        return company;
    }

    public int getSalary(){
        return salary;
    }
}

package org.fasttrackit.homeworkcurs9;

public class Person {

    public String name;
    public int age;
    public String position;

    public Person() {
    }

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
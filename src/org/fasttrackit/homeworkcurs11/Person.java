package org.fasttrackit.homeworkcurs11;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Person {
    private final String name;
    private final int age;
    private final String hairColor;

    Person (String name, int age, String hairColor){
        this.name=name;
        this.age=age;
        this.hairColor=hairColor;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getHairColor(){
        return hairColor;
    }
//    List <Person> persons = new ArrayList<>();

}

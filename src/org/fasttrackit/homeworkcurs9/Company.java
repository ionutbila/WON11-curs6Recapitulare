package org.fasttrackit.homeworkcurs9;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Company {

    Map<String, Person> persons = new HashMap<>();

    public Person getManager() {
        for (String i : persons.keySet()) {
            if (persons.get(i).position.equals("manager")) {
                return persons.get(i);
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> personsList = new ArrayList<>();
        for (String i : persons.keySet()) {
            if (persons.get(i).position.equals(profession)) {
                personsList.add(persons.get(i));
            }
        }
        return personsList;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> personsList = new ArrayList<>();
        for (String i : persons.keySet()) {
            if (persons.get(i).age > age) {
                personsList.add(persons.get(i));
            }
        }
        return personsList;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> personsList = new ArrayList<>();
        for (String i : persons.keySet()) {
            String name[] = persons.get(i).name.split(" ");
            for (String j : name) {
                if (j.equals(filterName)) {
                    personsList.add(persons.get(i));
                }
            }
        }
        return personsList;
    }

    public boolean employ(Person person) {
        for (String i : persons.keySet()) {
            if (person.position.equals("manager")) {
                if (persons.get(i).position == "manager") {
                    return false;
                }
            }
        }
        persons.put(person.name, person);
        return true;
    }


    public static void main(String[] args) {

        Company company = new Company();
        //company.persons.get("employee1");

        Person person1 = new Person("John Mc", 21, "welder");
        Person person2 = new Person("Ion Popescu", 22, "welder");
        Person person3 = new Person("Ioan Viorel", 41, "carpenter");
        Person person4 = new Person("Alin Florin", 48, "manager");
        Person person5 = new Person("Vasile John", 55, "carpenter");
        Person person6 = new Person("Marcel John", 74, "plummer");
        Person person7 = new Person("Marcel Johnny", 11, "manager");
        Person person8 = new Person("Ioan Florin", 42, "plummer");
        Person person9 = new Person("John Marcel", 29, "carpenter");
        Person person10 = new Person("Ioan Popescu", 61, "plummer");
        company.employ(person1);
        company.employ(person2);
        company.employ(person3);
        company.employ(person4);
        System.out.println(company.employ(person5));
        System.out.println(company.employ(person6));
        System.out.println(company.employ(person7));
        System.out.println(company.employ(person8));
        System.out.println(company.employ(person9));
        System.out.println(company.employ(person10));


        //System.out.println(company.persons.keySet());
        //System.out.println(company.getManager());

        // System.out.println(company.getPersons("carpenter"));
        //System.out.println(company.getPersonsOlder(55));

        //System.out.println(company.getPerson("John"));
    }
}

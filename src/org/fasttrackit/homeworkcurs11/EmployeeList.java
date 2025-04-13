package org.fasttrackit.homeworkcurs11;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class EmployeeList {
    public List<Employee> employees;

    public List<String> salaryBiggerThan(int salaryComparison) {
        List<String> people = new ArrayList<>();
        for (Employee i : employees) {
            if (i.getSalary() > salaryComparison) {
                people.add(i.getName());
            }
        }
        return people;
    }

    public Map<String, List<String>> personsInCompany() {
        Map<String, List<String>> persons = new HashMap<>();
        List<String> listOfCompanies = new ArrayList<>();

        for (Employee i : employees) {
            if (!listOfCompanies.contains(i.getCompany())) {
                listOfCompanies.add(i.getCompany());
            }
        }
        for (String j : listOfCompanies) {
            for (Employee k : employees) {
                if (k.getCompany().equals(j)) {
                    if (!persons.containsKey(j)) {
                        persons.put(j, new ArrayList<>());
                    }
                    persons.get(j).add(k.getName());
                }
            }
        }
        return persons;
    }

    public long sumOfSalaries() {
        long sum = 0;
        for (Employee i : employees) {
            sum += i.getSalary();
        }
        return sum;
    }

    public String biggestSalary() {
        int max = 0;
        String maxCompany = null;
        for (Employee j : employees) {
            if (j.getSalary() > max) {
                max = j.getSalary();
                maxCompany = j.getCompany();
            }
        }
        return maxCompany;
    }
}
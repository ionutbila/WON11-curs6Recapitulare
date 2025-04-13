package org.fasttrackit.homeworkcurs11;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class PersonList {

    List<Person> persons = new ArrayList<>();

    public List<String> listName() {
        List<String> list = new ArrayList<>();
        for (Person i : persons) {
            list.add(i.getName());
        }
        return list;
    }

    public Map<String, Integer> mapPers() {
        Map<String, Integer> map = new HashMap<>();
        for (Person i : persons) {
            map.put(i.getName(), i.getAge());
        }
        return map;
    }

    public List<String> ageLimit(Integer givenAge) {
        List<String> ageLimit = new ArrayList<>();
        for (Person i : persons) {
            if (i.getAge() > givenAge) {
                ageLimit.add(i.getName());
            }
        }
        return ageLimit;
    }

    public Map<String, List<String>> hairColorName() {
        Map<String, List<String>> hair = new HashMap<>();
        List<String> hairColors = new ArrayList<>();

        for (Person i : persons) {
            if (!hairColors.contains(i.getHairColor())) {
                hairColors.add(i.getHairColor());
            }
        }

        for (String i : hairColors) {
            for (Person j : persons) {
                if (j.getHairColor().equals(i)) {
                    if (!hair.containsKey(i)) {
                        hair.put(i, new ArrayList<>());
                    }
                    hair.get(i).add(j.getName());
                }
            }
        }
        return hair;
    }

    public Map<Integer, List<String>> agePeople() {
        Map<Integer, List<String>> ages = new HashMap<>();
        List<Integer> ageCategories = new ArrayList<>();

        for (Person i : persons) {
            if (!ageCategories.contains(i.getAge())) {
                ageCategories.add(i.getAge());
            }
        }

        for (int j : ageCategories) {
            for (Person k : persons) {
                if (k.getAge() == (j)) {
                    if (!ages.containsKey(j)) {
                        ages.put(j, new ArrayList<>());
                    }
                    ages.get(j).add(k.getName());
                }
            }
        }
        return ages;
    }
}
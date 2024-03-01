package org.fasttrackit.homeworkcurs9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public class Basket {
    ArrayList<String> fruits = new ArrayList<>();

    public boolean find(String fruit) {
        if (fruits.contains(fruit)) {
            return true;
        }
        return false;
    }

    public boolean remove(String fruit) {
        if (fruits.contains(fruit)) {
            fruits.remove(fruits.indexOf(fruit));
            return true;
        }
        return false;
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
        Collection<String> collection = new ArrayList();
        collection.add(fruits.get(0));
        for (int i = 1; i < fruits.size(); i++) {
            if (collection.contains(fruits.get(i))) {
                continue;
            } else {
                collection.add(fruits.get(i));
            }
        }
        return collection;
    }

    public boolean add(String fruit) {
        fruits.add(fruit);
        return true;
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        Iterator i = fruits.iterator();
        int count = 0;
        while (i.hasNext()) {
            count++;
            i.next();
        }
        return count;
    }
}

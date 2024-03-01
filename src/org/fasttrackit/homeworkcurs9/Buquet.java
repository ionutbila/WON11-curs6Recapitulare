package org.fasttrackit.homeworkcurs9;

import java.util.HashSet;
import java.util.Collection;

public class Buquet {
    HashSet<String> buquet = new HashSet<String>();

    public Collection<String> getAll() {
        return buquet;
    }

    public boolean add(String flower) {
        if (buquet.contains(flower)) {
            return false;
        }
        buquet.add(flower);
        return true;
    }

    public boolean remove(String flower) {
        if (buquet.contains(flower)) {
            buquet.remove(flower);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Buquet{" +
                "buquet=" + buquet +
                '}';
    }
}
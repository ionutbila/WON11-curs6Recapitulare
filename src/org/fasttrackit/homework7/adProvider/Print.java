package org.fasttrackit.homework7.adProvider;

public class Print implements AdProvider {
    @Override
    public void advertise(String text) {
        System.out.println("Printing in newspaper " + text);
    }
}

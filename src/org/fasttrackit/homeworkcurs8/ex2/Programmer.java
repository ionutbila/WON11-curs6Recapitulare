package org.fasttrackit.homeworkcurs8.ex2;

public class Programmer extends Employee {
    private String language;

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String getPosition() {
        return "programmer";
    }
}

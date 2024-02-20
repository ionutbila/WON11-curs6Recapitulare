package org.fasttrackit.homeworkcurs8.ex2;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public void setDbTechnology(String dbTechnology) {
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    public String getAddress() {
        return "db admin " + getAddress();
    }
}

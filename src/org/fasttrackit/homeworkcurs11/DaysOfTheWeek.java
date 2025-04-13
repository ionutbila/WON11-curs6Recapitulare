package org.fasttrackit.homeworkcurs11;

public enum DaysOfTheWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public String  DaySchedule() {
        return switch (this){
        case MONDAY -> "Sleep more on Mondays!";
        case TUESDAY -> "Do something!";
        case WEDNESDAY -> "THIS IS THE MIDDLE OF THE WEEK";
        case THURSDAY -> "The weekend is close";
        case FRIDAY -> "Last day of the week";
        case SATURDAY -> "Be happy, it's Saturday";
        case SUNDAY -> "GO TO CHURCH!";};
    }
    }
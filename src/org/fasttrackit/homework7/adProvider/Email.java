package org.fasttrackit.homework7.adProvider;

public class Email implements AdProvider {
    @Override
    public void advertise(String text) {
        System.out.println("Sending email with subject: " + text);
    }
}

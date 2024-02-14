package org.fasttrackit.homework7.adProvider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdProvider adProvider;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose where to advertise:");
        String adOption = scanner.nextLine();
        switch (adOption) {
            case "facebook" -> adProvider = new Facebook();
            case "email" -> adProvider = new Email();
            default -> adProvider = new Print();
        }
// ___________________________________
        adProvider.advertise("buy new shiny thing!");
    }
}

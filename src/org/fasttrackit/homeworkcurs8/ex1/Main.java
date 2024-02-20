package org.fasttrackit.homeworkcurs8.ex1;

public class Main {
    public static void main(String[] args) {

        Cosmetics cosmetics = new Cosmetics();
        cosmetics.setPrice(52);
        cosmetics.setName("ruj");
        cosmetics.setDescription("calitate buna");
        cosmetics.setQuantity(25);
        cosmetics.setColor("portocaliu");
        cosmetics.setWeight(1);

        System.out.println("Cosmetics");
        System.out.println(cosmetics.getPrice());
        System.out.println(cosmetics.getName());
        System.out.println(cosmetics.getDescription());
        System.out.println(cosmetics.getQuantity());
        System.out.println(cosmetics.getColor());
        System.out.println(cosmetics.getWeight());


        Electronics electronics = new Electronics();
        electronics.setPrice(22);
        electronics.setName("combina frigorifica");
        electronics.setDescription("folositoare");
        electronics.setQuantity(30);
        electronics.setType("electro-casnice");
        electronics.setLength(5);
        electronics.setWidth(10);
        electronics.setHeight(14);
        electronics.setWeight(24);

        System.out.println("Electronics");
        System.out.println(electronics.getPrice());
        System.out.println(electronics.getName());
        System.out.println(electronics.getDescription());
        System.out.println(electronics.getQuantity());
        System.out.println(electronics.getType());
        System.out.println(electronics.getLength());
        System.out.println(electronics.getWidth());
        System.out.println(electronics.getHeight());
        System.out.println(electronics.getWeight());

        Fridge fridge = new Fridge();
        fridge.setPrice(22);
        fridge.setName("combina frigorifica");
        fridge.setDescription("folositoare");
        fridge.setQuantity(30);
        fridge.setType("electro-casnice");
        fridge.setLength(5);
        fridge.setWidth(10);
        fridge.setHeight(14);
        fridge.setWeight(24);
        fridge.setTemperature(2);

        System.out.println("Fridge");
        System.out.println(fridge.getPrice());
        System.out.println(fridge.getName());
        System.out.println(fridge.getDescription());
        System.out.println(fridge.getQuantity());
        System.out.println(fridge.getType());
        System.out.println(fridge.getLength());
        System.out.println(fridge.getWidth());
        System.out.println(fridge.getHeight());
        System.out.println(fridge.getWeight());
        System.out.println(fridge.getTemperature());

      /*  Product[] products = new Product[4];
        products[0] = new Product();
        products[1] = new Cosmetics();
        products[2] = new Electronics();
        products[3] = new Fridge();

        for (int i = 0; i < products.length; i++) {
            if (i == 0) {
                System.out.println(products[1].getPrice());
                System.out.println(products[1].getName());
                System.out.println(products[1].getDescription());
                System.out.println(products[1].getQuantity());
            }
            if (i == 1) {
                System.out.println("Cosmetics");
                Cosmetics cosmetics1 = new Cosmetics();
                System.out.println(cosmetics1.getColor());
                System.out.println(cosmetics1.getWeight());
            }
            if (i == 2) {
                System.out.println("Electronics");
                Electronics electronics1 = new Electronics();
                System.out.println(electronics1.getType());
                System.out.println(electronics1.getLength());
                System.out.println(electronics1.getWidth());
                System.out.println(electronics1.getHeight());
                System.out.println(electronics1.getWeight());
            }
            if (i == 3) {
                System.out.println("Fridge");
                Fridge fridge1 = new Fridge();
                System.out.println(fridge1.getTemperature());
            }
        }*/
    }
}



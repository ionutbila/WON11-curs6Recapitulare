package homeworkCurs6;

public class ApplicationForProducts {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.getName();
        product2.getName();
        product3.getName();

        product1.getPrice();
        product2.getPrice();
        product3.getPrice();

        product1.getQuantity();
        product2.getQuantity();
        product3.getQuantity();

        product1.getCategory();
        product2.getCategory();
        product3.getCategory();

        product1.hasStock();
        product2.hasStock();
        product3.hasStock();

        product1.isCategory("frigider");
        product2.isCategory("Masina de spalat");
        product3.isCategory("Masina de tuns iarba");
    }
}

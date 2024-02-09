package homeworkCurs6;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (quantity > 0) {
            return true;
        }
        return false;
    }

    public boolean isCategory(String category) {
        if (category == this.category) {
            return true;
        }
        return false;
    }


}

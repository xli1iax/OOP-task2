public class Product {
    private String name;
    private double price;
    private double discount;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discount = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getDiscountPercentage() {
        return Math.round(discount * 100.0) / 100.0;
    }

    public double getBasePrice() {
        return price;
    }

    public void setName(String name) {
        if(name != null) this.name = name;
    }

    public void setDiscountPercentage(double discount) {
        if(discount >= 0 && discount <= 100) this.discount = discount;
    }

    public void setBasePrice(double price) {
        if(price >= 0) this.price = price;
    }

    public int computePrice() {
        double discountedPrice = price * (1 - discount / 100);
        return (int) Math.floor(discountedPrice);
    }
}

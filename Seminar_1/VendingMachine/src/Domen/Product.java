package Domen;

public class Product {

    private int productId;
    private String productName;
    private String productCategory;
    private double price;

    public Product(int productId, String productName, String productCategory, double price) throws Exception {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalStateException(String.format("Price is`not correct!", price));
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID = " + productId + 
                ", name = '" + productName + '\'' +
                ", category = '" + productCategory + '\'' +
                ", cost = " + price + 
                '}';
    }
}
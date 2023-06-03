package Domen;

public class Bottle extends Product{

    private int volume; //add parameter volume to parent class Product

    /**
     * Creating a product for VendingMachine
     * 
     * @param productId                         id product
     * @param productName                     name product
     * @param productCategory             category product
     * @param price                          price product
     * @throws Excetpion       for incorrect price product
     * 
     */
    
     public Bottle(int productId, String productName, String productCategory, double price, int volume) throws Exception{
        super(productId, productName, productCategory, price);   // call constructor
        this.volume = volume;                                    // added param
     }

    public int getVolume() {       //getter Volume
        return volume;
    }

    public void setVolume(int volume) {   //setter volume
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID = " + super.getProductId() + 
                ", name = '" + super.getProductName() + '\'' +
                ", category = '" + super.getProductCategory() + '\'' +
                ", cost = " + super.getPrice() + 
                ", volume = " + volume +
                '}';
    }
}

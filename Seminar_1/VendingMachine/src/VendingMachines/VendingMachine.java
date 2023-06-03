package VendingMachines;

import Domen.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();   //initialise Product
    }

    private int volume;
    private List<Product> products;
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {     //setter Volume
        this.volume = volume;
    }

    public List<Product> getProducts() {    //getter Volume
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}

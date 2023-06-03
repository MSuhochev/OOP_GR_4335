package Domen;

public class HotDrink extends Bottle{

   private int temperature;         //add parameter temperature to parent class Bottle

public HotDrink(int productId, String productName, String productCategory, double price, int volume, int temperature)
        throws Exception {                                           
    super(productId, productName, productCategory, price, volume);   // call constructor
    this.temperature = temperature;        // added parameter
}

public int getTemperature() {               //getter temperature
    return temperature;
}

public void setTemperature(int temperature) {  //setter temperature
    this.temperature = temperature;
}

@Override
    public String toString() {
        return "Product{" +
                "ID = " + super.getProductId() + 
                ", name = '" + super.getProductName() + '\'' +
                ", category = '" + super.getProductCategory() + '\'' +
                ", cost = " + super.getPrice() + 
                ", volume = " + super.getVolume() +
                ", temperature = " + temperature +
                '}';
   
};
}

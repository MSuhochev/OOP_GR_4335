import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays140", "Snack", 92.44);
        Product item2 = new Bottle(2, "Evervess", "LRB", 70, 500);
        Product item5 = new HotDrink(5, "Latte", "Coffee", 80, 100, 70);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Хрусteam", "Snack", 45.56));
        iMachine.addProduct(new Bottle(4, "AquaMinerale", "LRB", 50.23, 1000));
        iMachine.addProduct(item5);
        iMachine.addProduct(new HotDrink(6, "Cappuchino", "Coffee", 100, 100, 70));
        iMachine.addProduct(new HotDrink(7, "Green tea", "Tea", 50, 100, 70));

        for(Product prod: iMachine.getProducts()){
            System.out.println(prod.toString());
        }
    }
}

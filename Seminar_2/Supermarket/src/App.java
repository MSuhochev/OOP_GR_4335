import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpetialClient;
import Interfaces.iActorBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        
        Market market = new Market();

        iActorBehavior client1 = new OrdinaryClient("Boris");
        iActorBehavior client2 = new OrdinaryClient("Volodya");
        iActorBehavior client3 = new SpetialClient("Darya", 1);
        iActorBehavior client4 = new ActionClient("Lucky", 2, "2+1", 0);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);

        market.update();

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);

        market.ReturnOrder();

    }
}

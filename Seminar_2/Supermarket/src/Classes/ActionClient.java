package Classes;

/**Creating ActionClient class extends to the Actor class */
public class ActionClient extends Actor {  
    private int idAction;
    public String PromotionName;
    private static int CountActionUser;

// ActionClient class constructor
    public ActionClient(String name, int idAction, String PromotionName, int CountActionUser) { 
        super(name);
        this.idAction = idAction;
        this.PromotionName = PromotionName;
        ActionClient.CountActionUser = CountActionUser;
    }

    /**
     * @param number 
     */
    public static void setCountActionUser(int number) {
        }

    public static int getCountActionUser() {
        return CountActionUser;
    }

    public static void setClientNumber(int number) {
        if (CountActionUser > 5) {
            System.out.println("Sorry count of action is full");
        } else {
            setCountActionUser(number);    
        }
        }

    public int getId() {
        return idAction;
    }

    @Override                               // method getName override
    public String getName() {
        return super.name;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public Actor getActor() {
        return this;
    }
}
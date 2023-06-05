package Classes;

public class OrdinaryClient extends Actor {

    /**
     * @param name
     */
    public OrdinaryClient(String name) {   //Constructor for ordinary client
        super(name);
    }

    @Override                   //method getName override
    public String getName() {
        return super.name;
    }
    
    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }

    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }

    public void setMakeOrder(boolean pikUpOrder){
        super.isTakeOrder = pikUpOrder;
    }

    public void setTakeOrder(boolean makeOder){
        super.isMakeOrder = makeOder;
    }

    public Actor getActor(){
        return this;
    }
}

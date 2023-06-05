package Classes;

public class SpetialClient extends Actor {
    private int idSpetial;
    
    public SpetialClient(String name, int idSpetial){
        super(name);
        this.idSpetial = idSpetial;
    }
    
    public int getId() {
        return idSpetial;
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


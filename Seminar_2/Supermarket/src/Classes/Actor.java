package Classes;

import Interfaces.iActorBehavior;
/**Creating an abstract Actor class and connecting to the iActorBehaviour interface */
public abstract class Actor implements iActorBehavior {  
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name){   //Constructor Actor class
        this.name = name;
    }

    abstract public String getName(); //Creating abstract method for call the instance name 
   
}

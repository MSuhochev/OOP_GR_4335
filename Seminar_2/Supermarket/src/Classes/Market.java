package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehavior;
import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehavior;

// Create the Market class and connect to the interfaces iMarketBehaviour and iQueueBehaviour
public class Market implements iMarketBehavior, iQueueBehavior {

    private List<iActorBehavior> queue;

// Market class constructor
    public Market() {
        this.queue = new ArrayList<iActorBehavior>();
    }

    // Override the method for client entered the store and was added to the queue
    @Override
    public void acceptToMarket(iActorBehavior actor){
        System.out.println(actor.getActor().getName() + " Client came to Market ");
        takeInQueue(actor);
    }

    // Override the method for added to the queue
    @Override
    public void takeInQueue(iActorBehavior actor){
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " Client added to Queue ");
    }
    //Override the method the client has left the store and is removed from the queue
    @Override
    public void releaseFromMarket(List<Actor> actors){
        for(Actor actor:actors){
            System.out.println(actor.getName() + " Client left the Market ");
            queue.remove(actor);
        }
    }

    // Override the method for updating data on order acceptance, issue and removal from the queue.
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    // Override method for issuing an order to a client
    @Override
    public void giveOrder(){
        for(iActorBehavior actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " Client received his order ");
            }
        }
    }

    // Override method removing a customer from the queue and exiting the store
    @Override
    public void releaseFromQueue(){
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehavior actor: queue){
            if(actor.isTakeOrder()){
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " Client left the queue ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    // Override method for receiving an order from a client
    @Override
    public void takeOrder(){
        for(iActorBehavior actor: queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " Client maked an order ");
            }
        }
    }

    // Method for returning goods to the store, exiting the queue and exiting the store
    public void ReturnOrder() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehavior actor:queue)
        {
            if(actor.isTakeOrder())
            {
                actor.setTakeOrder(false);
                System.out.println(actor.getActor().getName()+" returned the product to the store ");

                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" customer left the queue ");
            }
        }
    releaseFromMarket(releaseActors);
    }
}


    


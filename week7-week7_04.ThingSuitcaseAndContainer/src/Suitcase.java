
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Suitcase {
    private int maximumWeight;
    private ArrayList<Thing> things;
    
    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing){
        if (thing.getWeight() + this.getTotalWeight() <= this.maximumWeight){
            things.add(thing);
        }
        
    }
    
    public String toString(){
        if (things.size() == 0){
            return "empty (0 kg)";
        } else if (things.size() == 1) {
            return " 1 thing (" + this.getTotalWeight() + "kg)";
        } else {
            return "" + things.size() + " things (" + this.getTotalWeight() + " kg)";
        }
        
    }
    
    public void printThings(){
        for (Thing thing : things){
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        return this.getTotalWeight();
    }
    
    private int getTotalWeight(){
        int weight = 0;
        for (Thing thing : things){
            weight += thing.getWeight();
        }
        
        return weight;
    }
    
    public Thing heaviestThing(){
        
        if (things.isEmpty()){
            return null;
        }
        
        Thing heaviest = things.get(0);
        
        for (Thing thing : things){
            if (thing.getWeight() > heaviest.getWeight()){
                heaviest = thing;
            }
        }
        
        return heaviest;
        
    }
    
}

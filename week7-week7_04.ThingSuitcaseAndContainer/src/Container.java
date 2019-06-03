
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
public class Container {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maximumWeight){
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() + this.getTotatlWeight() <= this.maximumWeight ){
            suitcases.add(suitcase);
        }
    }
    
    private int getTotatlWeight(){
        int weight = 0;
        for (Suitcase suitcase : suitcases){
            weight += suitcase.totalWeight();
        }
        
        return weight;
    }
    
    public String toString(){
        return "" + suitcases.size() + " suitcases (" + this.getTotatlWeight() + " kg)";
    }
    
    public void printThings(){
        for (Suitcase suitcase : suitcases){
            suitcase.printThings();
        }
    }
    
}

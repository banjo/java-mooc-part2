/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Administrator
 */
public class Packer {
    private int boxesVolume;
    private List<Box> packed;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
        this.packed = new ArrayList<Box>();
    }
    
    public List<Box> packThings (List<Thing> things){
        Box newBox = new Box(boxesVolume);
        
        for (Thing thing : things){
            if (thing.getVolume() + newBox.getVolume() < this.boxesVolume || newBox.getVolume() == 0){
                newBox.addThing(thing);
            } else {
                this.packed.add(newBox);
                newBox = new Box(boxesVolume);
                newBox.addThing(thing);
            }
        }
        
        if (newBox.getVolume() > 0){
           this.packed.add(newBox); 
        }
        
        
        return this.packed;
    }
    
}

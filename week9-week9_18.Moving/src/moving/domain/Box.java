/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> stuff;
    
    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.stuff = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if (thing.getVolume() + this.getVolume() <= this.maximumCapacity){
            boolean transfer = this.stuff.add(thing);
            return transfer;
        }
        
        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : stuff){
            volume += thing.getVolume();
        }
        return volume;
    }
    
}

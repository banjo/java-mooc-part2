/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Group implements Movable {
    private List<Movable> movables;

    public Group() {
        movables = new ArrayList<Movable>();
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables){
            movable.move(dx, dy);
        }
    }
    
    public void addToGroup(Movable movable){
        if (!movables.contains(movable)){
            movables.add(movable);
        }
    }

    @Override
    public String toString() {
        String string = "";
        
        for (Movable movable : movables){
            string += "" + movable.toString() + "\n" ;
        }
        
        return string;
    }
    
    
}

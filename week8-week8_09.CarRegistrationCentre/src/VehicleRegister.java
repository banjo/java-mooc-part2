
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if (!this.owners.containsKey(plate)){
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate){
        if (this.owners.containsKey(plate)){
            return this.owners.get(plate);
        }
        return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        if (this.owners.containsKey(plate)){
            this.owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate : this.owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> onlyOwner = new ArrayList<String>();
        
        for (RegistrationPlate plate : this.owners.keySet()){
            if (!onlyOwner.contains(this.owners.get(plate))){
                onlyOwner.add(this.owners.get(plate));
            }
        }
        
        for (String owner : onlyOwner){
            System.out.println(owner);
        }
    }
    
    
            
    
}

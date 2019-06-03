
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Contact implements Comparator<Contact> {
    private String name;
    private String address;
    private Set<String> numbers;
    
    public Contact(String name){
        this.name = name;
        this.address = "";
        numbers = new HashSet<String>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAddress(String adress){
        this.address = adress;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void addNumber(String number){
        this.numbers.add(number);
    }
    
    public Set<String> getNumbers(){
        return this.numbers;
    }
    
    public boolean noPhoneNumbers(){
        if (numbers.isEmpty()){
            return true;
        } 
        
        return false;
    }
    
    public void removeNumbers(){
        this.numbers.clear();
    }

    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
       }
    
}

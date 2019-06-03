
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        Purchase purchase = new Purchase(product, 1, price);
        
        if (this.basket.containsKey(product)){
            this.basket.get(product).increaseAmount();
            return;
        }
        
        this.basket.put(product, purchase);
    }
    
    public int price(){
        int price = 0;
        for (Purchase purchase : basket.values()){
            price += purchase.price();
        }
        
        return price;
    }
    
    public void print(){
        for (Purchase purchase : basket.values()){
            System.out.println(purchase.toString());       
        }
    }
}

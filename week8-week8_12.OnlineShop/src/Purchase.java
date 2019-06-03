/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice){
        this.amount = amount;
        this.product = product;
        this.unitPrice = unitPrice;
        
    }
    
    public int price(){
        return this.amount * this.unitPrice;
    }
    
    public void increaseAmount(){
        this.amount++;
    }
    
    public String toString(){
        return this.product + ": " + this.amount;
    }
    
}

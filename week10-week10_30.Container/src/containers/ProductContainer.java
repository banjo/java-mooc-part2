/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Administrator
 */
public class ProductContainer extends Container {
    private String product;
    
    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.product = productName;
    }
    
    public String getName(){
        return product;
    }
    
    public void setName(String newName){
        product = newName;
    }

    @Override
    public String toString() {
        return product + ": " + super.toString();
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Calculator {
    private Reader reader = new Reader();
    private int calculations;
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = reader.readString();
            if (command.equals("end")){
                break;
            }
            
            if (command.equals("sum")){
                sum();
                this.calculations++;
            } else if (command.equals("difference")){
                difference();
                this.calculations++;
            } else if (command.equals("product")) {
                product();
                this.calculations++;
            }
            
            
        }
        
        statistics();
    }
    
    private void sum(){
        int value1 = getValue(1);
        int value2 = getValue(2);
        
        System.out.println("sum of the values " + (value1 + value2));
    }
    
    private void difference(){
        int value1 = getValue(1);
        int value2 = getValue(2);
        
        System.out.println("difference of the values " + (value1 - value2));
        
    }
    
    private void product(){
        int value1 = getValue(1);
        int value2 = getValue(2);
        
        System.out.println("product of the values " + (value1 * value2));
        
    }
    
    private void statistics(){
        System.out.println("Calculations done: " + this.calculations);
        
    }
    
    private int getValue(int numberOfValue){
        System.out.print("Value" + numberOfValue + ": ");
        return reader.readInteger();
    }
    
}

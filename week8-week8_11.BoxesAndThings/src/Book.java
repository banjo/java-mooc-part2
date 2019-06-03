/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;
    
    public Book(String writer, String name, double weight){
        this.name = name;
        this.weight = weight;
        this.writer = writer;
    }
    
    public double weight(){
        return this.weight;
    }
    
    public String toString(){
        return this.writer + ": " + this.name;
    }
    
}

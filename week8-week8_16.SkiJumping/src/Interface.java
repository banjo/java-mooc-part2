
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Interface {
    private Scanner reader;
    private Data database;
            
    public Interface(){
        reader = new Scanner(System.in);
        database = new Data(reader);
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        
        database.getRunners();
        
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        
        
        int round = 1;
        while (true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String answer = reader.nextLine();
            System.out.println("");

            if (!answer.equals("jump")){
                return;
            }
            
            System.out.println("Round " + round);
            System.out.println("");
            
            System.out.println("Jumping order:");
            database.printOrder();
            System.out.println("");
            
            database.round();
            
            System.out.println("Results of round " + round);
            database.printScore();
            System.out.println("");
            
            database.sort();
            
            round++;
        }   
    }
    
    public void score(){
        System.out.println("Thanks!");
        System.out.println("");
        
        System.out.println("Tournament results: ");
        database.printResults();
        
    }
}
    

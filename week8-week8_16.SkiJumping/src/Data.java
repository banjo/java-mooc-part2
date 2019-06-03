
import java.util.ArrayList;
import java.util.Collections;
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
public class Data {
    private ArrayList<Jumper> participants;
    private Scanner reader;
    
    public Data(Scanner reader){
        participants = new ArrayList<Jumper>();
        this.reader = reader;
    }
    
    public void getRunners(){
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            
            if (name.equals("")){
                break;
            }
            
            Jumper participant = new Jumper(name);
            participants.add(participant);
        }
    }
    
    public int getSize(){
        return this.participants.size();
    }
    
    public void printOrder(){
        int i = 1;
        for (Jumper jumper : participants){
            System.out.print("  " + i + ". ");
            System.out.println(jumper.toString());
            i++;
        }
    }
    
    public void printScore(){
        for (Jumper jumper : participants){
            jumper.printScore();
        }
    }
    
    public void round(){
        for (Jumper jumper : participants){
            jumper.round();
        }
    }
    
    public void sort(){
        Collections.sort(participants);
    }
    
    public void printResults(){
        Collections.reverse(participants);
        System.out.println("Position    Name");
        
        int position = 1;
        
        for (Jumper jumper : participants){
            System.out.println("" + position + "           " + jumper);
            System.out.print("            jump lengths: ");
            jumper.printLengths();
            position++;
        }
        
        
    }
}

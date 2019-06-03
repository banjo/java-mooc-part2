
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
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statements: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
        System.out.println("");
        
        while (true){
            System.out.print("Statement: ");

            String statement = reader.nextLine();

            if (statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")){
                this.getWord();
            } else if (statement.equals("translation")){
                this.printWord();
            } else {
                System.out.println("Uknown statement");
            }
          
            System.out.println("");
        }
    }
    
    private void getWord(){
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        
        this.dictionary.add(word, translation);
    }
    
    private void printWord(){
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        System.out.print("Translation: ");
        System.out.println(this.dictionary.translate(word));
    }
    
}

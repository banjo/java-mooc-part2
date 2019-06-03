import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Change {
    private String word;
    private char from;
    private char to;
    
    public Change(char fromCharacter, char toCharacter){
        this.from = fromCharacter;
        this.to = toCharacter; 
    }
    
    public String change(String characterString){
        this.word = characterString;
        
        String newWord = "";
        
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == this.from){
                newWord += "" + this.to;
            } else {
                newWord += "" + word.charAt(i);
            }
        }
        
        return newWord;

    }
    
}

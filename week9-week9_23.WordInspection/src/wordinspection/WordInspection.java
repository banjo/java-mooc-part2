/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class WordInspection {
    private File file;
    private Scanner reader;
    
    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount() throws Exception {
        this.reader = new Scanner(this.file);
        int count = 0;
        
        while (reader.hasNext()){
            reader.next();
            count++;
        }
        
        return count;
    }
    
    public List<String> wordsContainingZ() throws Exception{
        this.reader = new Scanner(this.file, "UTF-8");
        
        List<String> zWords = new ArrayList<String>();
        
        while(reader.hasNext()){
            String word = reader.next();
            
            if (word.contains("z")){
                zWords.add(word);
            }
        }
        
        return zWords;
    }
    
    public List<String> wordsEndingInL() throws Exception{
        this.reader = new Scanner(this.file, "UTF-8");
        List<String> lWords = new ArrayList<String>();
        
        while(reader.hasNext()){
            String word = reader.next();
            
            if (word.endsWith("l")){
                lWords.add(word);
            }
        }
        
        return lWords;
    }
    
    public List<String> palindromes() throws Exception{
        this.reader = new Scanner(this.file, "UTF-8");
        List<String> palindromes = new ArrayList<String>();
        
        while(reader.hasNext()){
            String word = reader.next();
            
            String palindrome = this.makePalindrome(word);
            
            if (word.equalsIgnoreCase(palindrome)){
                palindromes.add(word);
            }
            
        }
        
        return palindromes;
        
    }
    
    private String makePalindrome(String word){
        String newWord = "";
        
        for (int i = word.length(); i > 0; i--){
            newWord = newWord + word.charAt(i - 1);
        }
        
        return newWord;
        
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception{
        this.reader = new Scanner(this.file, "UTF-8");
        List<String> allVowels = new ArrayList<String>();

        while (reader.hasNext()) {
            String word = reader.next();
            
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")){
                allVowels.add(word);
                
            }

        }

        return allVowels;
    }
    
}

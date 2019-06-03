
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Dictionary {
    private HashMap<String, String> translations;
    
    public Dictionary(){
        this.translations = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if (this.translations.containsKey(word)){
            return this.translations.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation){
        this.translations.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.translations.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();
        String word = "";
        
        for (String key : this.translations.keySet()){
            word = key + " = " + this.translations.get(key);
            translationList.add(word);
        }
    
        return translationList;
    }
    
    
    
}

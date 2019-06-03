/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> translations;

    public PersonalMultipleEntryDictionary() {
        this.translations = new HashMap<String, Set<String>>();
    }
    
    @Override
    public void add(String word, String entry) {
        
        // create word if it doesnt exist
        if (!this.translations.containsKey(word)){
            this.translations.put(word, new HashSet<String>());
        }
        
        // add entry to the word
        this.translations.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.translations.get(word);
    }

    @Override
    public void remove(String word) {
        if (this.translations.containsKey(word)){
            this.translations.remove(word);
        }
    }
}

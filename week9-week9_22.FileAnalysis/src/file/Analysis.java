/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Analysis {
    private File file;
    private Scanner reader;
    
    public Analysis(File fileName) throws Exception {
        this.file = fileName;
    }
    
    public int lines() throws Exception {
        reader = new Scanner(this.file);
        
        int lines = 0;
        
        while (reader.hasNext()){
            reader.nextLine();
            lines++;
        }
        return lines;
    }
    
    public int characters() throws Exception{
        reader = new Scanner(this.file);
        
        int characters = 0;
        int lines = 0;
        
        while (reader.hasNext()){
            String word = reader.nextLine();
            lines++;
            
            characters += word.length();
        }
        
        return characters + lines;
    }
    
}

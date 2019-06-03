
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points;
    private int length;
    private int[] judgeVotes;
    private Random randomInt;
    private List<Integer> lengths;
    private int round;
    
    public Jumper(String name){
        this.name = name;
        this.points = 0;
        this.length = 0;
        judgeVotes  = new int[5]; 
        this.randomInt = new Random();
        lengths = new ArrayList<Integer>();
    }
    
    public String toString(){
        return this.name + " (" + this.points + " points)";
    }
    
    public void round(){
        int currentLength = (60 + this.randomInt.nextInt(61));
        this.length += currentLength;
        this.lengths.add(currentLength);
        
        for (int i = 0; i < 5; i++){
            int score = 10 + randomInt.nextInt(11);
            judgeVotes[i] = score;
        }
        
        Arrays.sort(judgeVotes);
        
        this.points += currentLength + judgeVotes[1] + judgeVotes[2] + judgeVotes[3];
    }
    
    public void printScore(){
        System.out.println("  " + this.name);
        System.out.println("    length: " + this.lengths.get(this.lengths.size() - 1));
        System.out.println("    judge votes: " + Arrays.toString(judgeVotes));
    }
    
    public int getPoints(){
        return this.points;
    }

    @Override
    public int compareTo(Jumper o) {
        return this.points - o.points;
    }
    
    public void printLengths(){
        for (int i = 0; i < this.lengths.size(); i++){
            System.out.print(this.lengths.get(i));
            
            if (i == this.lengths.size() - 1){
                System.out.println(" m");
            } else {
                System.out.print(" m, ");
            }
            
        }
        
        System.out.println("");
    }
    
}

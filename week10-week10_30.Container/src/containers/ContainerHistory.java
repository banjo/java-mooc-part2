/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ContainerHistory  {
    private ArrayList<Double> history;
    
    public ContainerHistory(){
        history = new ArrayList<Double>();
        
    }
    
    public void add(double situation){
        history.add(situation);
    }
    
    public void reset(){
        history.clear();
    }
    
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        
        if (history.isEmpty()){
            return 0;
        }        
        
        double max = 0;
        
        for (int i = 0; i < history.size(); i++){
            if (history.get(i) > max){
                max = history.get(i);
            }
        }
        
        return max;
    }
    
    public double minValue(){

        double min = history.get(0);
        
        for (int i = 0; i < history.size(); i++){
            if (history.get(i) < min){
                min = history.get(i);
            }
        }
        
        return min;
        
    }
    
    public double average(){
        if (history.isEmpty()){
            return 0;
        }
        
        double total = 0;
        
        for (double number : history){
            total += number;
        }
        
        return total / history.size();
    }
    
    public double greatestFluctuation() {
        double maxFluctuation = 0;
        List<Double> maxFluctuate = new ArrayList<Double>();
        if (this.history.isEmpty() || this.history.size() == 1) {
            return maxFluctuation;
        } else {
            for (int i = 0; i < this.history.size(); i++) {
                if (i != this.history.size() - 1) {
                    double firstNumber = this.history.get(i);
                    double secondNumber = this.history.get(i + 1);
                    maxFluctuation = secondNumber - firstNumber;
                    maxFluctuate.add(maxFluctuation);
                } else {
                    double firstNumber = this.history.get(i - 1);
                    double secondNumber = this.history.get(i);
                    maxFluctuation = secondNumber - firstNumber;
                    maxFluctuate.add(maxFluctuation);
                }
            }
        }
        return Math.abs(Collections.max(maxFluctuate));
    }
    
    public double variance() {
        double mean = average();
        double sum = 0;

        for (double history1 : history) {
            sum += Math.pow((history1 - mean), 2);
        }
        return sum / (history.size() - 1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors){
            if (!sensor.isOn()){
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!this.isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException("Either the sensors are off or there aren't any");
        }
        
        int average = 0;
        
        for (Sensor sensor: this.sensors){
            average += sensor.measure();
        }
        
        average = average / this.sensors.size();
        this.readings.add(average);
        return average;
        
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return this.readings; 
    }
    
}

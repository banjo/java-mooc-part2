
import java.util.ArrayList;
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
public class Interface {
    private Scanner reader;
    private ArrayList<Airplane> airplanes;
    
    public Interface(Scanner reader, ArrayList<Airplane> airplanes){
        this.reader = reader;
        this.airplanes = airplanes;
    }
    
    public void start(){
        this.airportPanel();
        this.flightService();
    }
    
    public void airportPanel(){
        System.out.println("Airport panel");
        this.printLines();
        
        while (true){
            this.givePanelAlternatives();
            String answer = reader.nextLine();
            
            if (answer.equals("1")){
                addAirplane();
            } else if (answer.equals("2")){
                addFlight();
            } else if (answer.equals("x")){
                break;
            } else {
                continue;
            }
        }
         
    }
    
    private void addAirplane(){
        System.out.print("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int cap = Integer.parseInt(reader.nextLine());
        
        if (!this.airplanes.contains(ID)){
            this.airplanes.add(new Airplane(ID, cap));
        }
        
        
    }
    
    private void addFlight(){
        System.out.print("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String dep = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String dest = reader.nextLine();
        
        for (Airplane airplane : this.airplanes){
            if (airplane.getID().equalsIgnoreCase(ID)){
                airplane.flight(dep, dest);
            }
        }
    }
    
    public void flightService(){
        while (true){
            this.giveFlightServiceAlternatives();
            String answer = reader.nextLine();
        
            if (answer.equals("1")){
                printPlanes();
            } else if (answer.equals("2")){
                printFlights();
            } else if (answer.equals("3")){
                printPlaneInfo();
            } else if (answer.equals("x")){
                break;
            } else {
                continue;
            }  
        }  
    }
    
    public void printPlanes(){
        for (Airplane airplane : this.airplanes){
            System.out.println(airplane);
        }
    }
    
    public void printFlights(){
        for (Airplane airplane : this.airplanes){
            airplane.printFlights();
        }
    }
    
    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String ID = reader.nextLine();
        
        for (Airplane airplane : this.airplanes){
            if (airplane.getID().equals(ID)){
                System.out.println(airplane);
            }
        }
        
    }
    
    private void printLines(){
        for (int i = 0; i < 25; i++){
            System.out.print("-");
        }
        
        System.out.println("");
    }
    
    private void givePanelAlternatives(){
        System.out.print("Choose operation:\n" +
"[1] Add airplane\n" +
"[2] Add flight\n" +
"[x] Exit\n");
    }
    
    private void giveFlightServiceAlternatives(){
        System.out.println("Flight service");
        this.printLines();
        System.out.print("Choose operation:\n" +
"[1] Print planes\n" +
"[2] Print flights\n" +
"[3] Print plane info\n" +               
"[x] Quit\n");
    }
    
}


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
        Interface panel = new Interface(reader, airplanes);
        
        panel.start();
        
    }
}

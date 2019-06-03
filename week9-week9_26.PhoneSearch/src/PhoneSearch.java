
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
public class PhoneSearch {
    private Scanner reader;
    private ContactBook contactBook;

    public PhoneSearch() {
        this.reader = new Scanner(System.in, "UTF-8");
        this.contactBook = new ContactBook();
    }

    public void start(){
        this.availableOperations();
        this.command();
        
    }
    
    private void availableOperations(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println("");
    }
    
    private void command(){
        while (true){
            System.out.print("command: ");
            String answer = this.reader.nextLine();

            if (answer.equals("1")){
                // add number
                this.addNumberToContacts();
                
            } else if (answer.equals("2")){
                // search for number
                this.printNumberInContacts();
                
            } else if (answer.equals("3")){
                this.printNameByPhoneNumber();
                
            } else if (answer.equals("4")){
                this.addAddress();
                
            } else if (answer.equals("5")){
                this.printContactInformation();
                
            } else if (answer.equals("6")){
                this.delete();
                
            } else if (answer.equals("7")){
                this.keywordSearch();
            } else if (answer.equalsIgnoreCase("x")){
                break;
            }
            
            System.out.println("");
        }
    }
    
    private void addNumberToContacts(){
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        System.out.print("number: ");
        String number = this.reader.nextLine();
        this.contactBook.addNumber(name, number);
    }
    
    private void printNumberInContacts(){
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        this.contactBook.printNumberByName(name);
        
    }

    private void printNameByPhoneNumber() {
        System.out.print("number: ");
        String number = this.reader.nextLine(); 
        
        this.contactBook.printNameByNumber(number);
        
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = this.reader.nextLine();
        
        System.out.print("street: ");
        String street = this.reader.nextLine();

        System.out.print("city: ");
        String city = this.reader.nextLine();

        String newAddress = street + " " + city;
        
        this.contactBook.addAddressToContact(name, newAddress);
        
    }

    private void printContactInformation() {
        System.out.print("whose information: ");
        String name = this.reader.nextLine(); 
        
        this.contactBook.printContactInformation(name);
    }

    private void delete() {
        System.out.print("whose information: ");
        String name = this.reader.nextLine();
        
        this.contactBook.deleteContact(name);
    
    }

    private void keywordSearch() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = this.reader.nextLine();

        this.contactBook.keywordSearch(keyword);
    
    }
    
    
}

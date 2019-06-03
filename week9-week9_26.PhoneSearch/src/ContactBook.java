
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ContactBook {
    private List<Contact> contacts;
    
    public ContactBook(){
        this.contacts = new ArrayList<Contact>();
    }
    
    private Contact searchContact(String name){
        // return contact if it exists, else return null.
        for (Contact contact : this.contacts){
            if (contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }
    
    public void addNumber(String name, String number){
        Contact returnedContact = this.searchContact(name);
        
        // if contact doesnt exist, add and add number. 
        if (returnedContact == null){
            Contact newContact = new Contact(name);
            newContact.addNumber(number);
            this.contacts.add(newContact);
            return;
        }
        // add number if it exists
        returnedContact.addNumber(number);
        this.contacts.add(returnedContact);
    }
    
    public void printNumberByName(String name){
        Contact contact = this.searchContact(name);
        
        if (contact == null || (contact.getAddress().equals("") && contact.noPhoneNumbers() )){
            System.out.println(" not found");
            return;
        }
        
        for (String number : contact.getNumbers()){
            System.out.println(" " + number);
        }
        
    }

    public void printNameByNumber(String number) {
        for (Contact contact : this.contacts){
            for (String contactNumber : contact.getNumbers()){
                if (contactNumber.equalsIgnoreCase(number)){
                    System.out.println(" "+ contact.getName());
                    return;
                }
            }
        }
        
        System.out.println("  not found");
    }

    public void addAddressToContact(String name, String address) {
        Contact contact = this.searchContact(name);
        
        if (contact == null){
            Contact newContact = new Contact(name);
            newContact.setAddress(address);
            this.contacts.add(newContact);
            return;
        }
        
        contact.setAddress(address);
    }

    public void printContactInformation(String name) {
        Contact contact = this.searchContact(name);
        
        if (contact == null || (contact.getAddress().equals("") && contact.noPhoneNumbers() )){
            System.out.println("  not found");
            return;
        }
        
        if (contact.getAddress().equals("")){
            System.out.println("  address unknown");
        } else {
            System.out.println("  address: " + contact.getAddress());
        }
        
        if (contact.noPhoneNumbers()){
            System.out.println("  phone number not found");
        } else {
            System.out.println("  phone numbers:");
            
            for (String number : contact.getNumbers()){
                System.out.println("   " + number);
            }
            
        }
    }

    public void deleteContact(String name) {
        Contact contact = this.searchContact(name);
        
        if (contact == null){
            return;
        }

        contact.setAddress("");
        contact.removeNumbers();
    
    }

    public void keywordSearch(String keyword) {
        if (keyword.equals("")){
            // print all
            
            this.printList(this.contacts);
            
            return;
        }
        
        // search all
        // create list for contacts with keyword
        ArrayList<Contact> contactsWithKeyword = new ArrayList<Contact>();
        
        // add all contacts with keyword
        
        for (Contact contact : this.contacts){
            if (contact.getName().contains(keyword)){
                contactsWithKeyword.add(contact);
            } else if (contact.getAddress().contains(keyword)){
                contactsWithKeyword.add(contact);
            }
        }
        
        // sort contacts
        Collections.sort(contactsWithKeyword, new Comparator<Contact>(){
            @Override
            public int compare(Contact o1, Contact o2){
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        
        if (contactsWithKeyword.isEmpty()){
            System.out.println(" keyword not found");
            return;
        }
        
        this.printList(contactsWithKeyword);
    
    }

    private void printList(List<Contact> contactList) {
        for (Contact contact : contactList){
            System.out.println(" " + contact.getName());
            this.printContactInformation(contact.getName());
            System.out.println("");
        }
    
    }
    
    
    
}

package com.example.javachallenge;

import java.util.HashMap;
import java.util.Map;

public class Contacts {

    //Showing welcoming message
    public String welcomePage(){
        String welcomeOutput = ("Choose one of three options:" +
                "\n\t1. Show all contacts" +
                "\n\t2. Add a new contact" +
                "\n\t3. Search for a contact" +
                "\n\t4. Delete a contact" +
                "\n\t5. Go back to the previous menu");
        return welcomeOutput;
    }

    //Creating a contact book
    Map<String, Integer> contacts = new HashMap<>();

    //Adding new contacts
    public Map<String, Integer> contactBookAdd(String name, Integer number){
        try{
            contacts.put(name, number);
        }catch (Exception e){
            System.out.println("You've done something wrong.");
        }

        return contacts;
    }

    public void showContacts(){
        System.out.println("Name: " + contacts.keySet());
        System.out.println("Number: " + contacts.values());
    }

    public void searchContact(String searchName){
        try{
            System.out.println(searchName + " " + contacts.get(searchName));
        }catch(Exception e){
            System.out.println("There is no contact like that.");
        }

    }

    public void deleteContact(String deletingName){
        contacts.remove(deletingName);
        System.out.println("The " + deletingName + " has been deleted.");
    }
}

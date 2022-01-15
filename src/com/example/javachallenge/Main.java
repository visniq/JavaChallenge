package com.example.javachallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hello message
        Phone phone = new Phone("iPhone 8", "Peter");
        System.out.println("This is " + phone.getUserName() + " " + phone.getPhoneName() +
                "\nHello there my friend!");



        // Creating boolean for ending first loop
        boolean wantEnd = false;

        Contacts contacts = new Contacts();
        Messages messages = new Messages();



        // Start of the first menu
        do {
            System.out.println("\t1. Manage contacts" +
                    "\n\t2. Messages" +
                    "\n\t3. Quit");

            // Getting first choice
            Scanner scanner = new Scanner(System.in);
            Integer firstSelect = scanner.nextInt();


            //Contacts
            if(firstSelect == 1){
                System.out.println(contacts.welcomePage());
                Integer secondChoice = scanner.nextInt();
                switch(secondChoice){
                    case 1:
                        contacts.showContacts();
                        break;
                    case 2:
                        String newContactName;
                        Integer newContactNumber;
                        boolean noMoreNewContacts = false;
                        while(!noMoreNewContacts) {

                                System.out.println("Please enter new contact name: ");
                                newContactName = scanner.next();
                                System.out.println("Please enter new contact number: ");
                                newContactNumber = scanner.nextInt();
                                contacts.contactBookAdd(newContactName, newContactNumber);
                                System.out.println("Do you wanna add more contacts? [Y/N]");
                                String addingContactChoice = scanner.next();
                                if (addingContactChoice.equals("N")){
                                    noMoreNewContacts = true;
                                }


                        }
                        break;
                    case 3:
                        System.out.println("Please specify a name that you are searching for: ");
                        String searchedName = scanner.next();
                        contacts.searchContact(searchedName);
                        break;
                    case 4:
                        System.out.println("Please tell me a name to remove: ");
                        String deleteContact = scanner.next();
                        contacts.deleteContact(deleteContact);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Please enter valid number");
                }

                //Messages
            }else if(firstSelect == 2){
                boolean noMore = false;
                boolean noMoreMessages = false;

                Integer messageMenuChoice = scanner.nextInt();
                do{
                    switch(messageMenuChoice) {
                         case 1:
                            messages.showMessages();
                             break;
                         case 2:
                             while (!noMoreMessages) {
                                 System.out.println("Please specify your message");
                                 String userMessage = scanner.next();
                                 messages.addMessage(userMessage);
                                 System.out.println("Do you want to write more messages? [Y/N]");
                                 String messageWritingChoice = scanner.next();
                                if (messageWritingChoice.equals("Y")) {
                                    noMoreMessages = true;
                                 }
                            break;
                             }

                        case 3:
                            noMore = true;
                            break;
                        default:
                            System.out.println("You specified wrong value!");
                    }
                }while(!noMore);
                Integer thirdChoice = scanner.nextInt();
            }else if(firstSelect == 3){
                wantEnd = true;
            }else{
                System.out.println("Enter a number from 1 to 3\n");
                continue;
            }

        }while(!wantEnd);
    }



}

/**Simulate your phone's contacts and messages applications
 *
 * Greet the user [DONE]
 * Show these 3 options 1. Manage contacts  2. Messages  3. Quit [DONE]
 * In case of selecting 1 --> show these options: [DONE]
 *
 * 1. Show all contacts
 * 2. Add a new contact
 * 3. Search for a contact
 * 4. Delete a contact
 * 5. Go back to the previous menu
 *
 * In case of 2 --> show these options:
 *
 * 1. See the list of all messages
 * 2. Send a new message
 * 3. Go back to the previous menu
 *
 * In case of 3 --> Quit the application
 *
 */

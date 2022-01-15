package com.example.javachallenge;

import java.util.ArrayList;

public class Messages {

    public String welcomePage(){
        String welcomeOutput = ("\n\t1. See the list of all messages" +
                "\n\t2. Send a new message" +
                "\n\t3. Go back to the previous menu");
        return welcomeOutput;
    }

    ArrayList<String> userMessages = new ArrayList<>();
    public void addMessage(String userMessage){
        userMessages.add(userMessage);
        System.out.println("Sending message " + "'" + userMessage + "'" + " the other user...");
    }

    public void showMessages(){
        for(int i = 0; i<userMessages.size(); i++){
            System.out.println("This is your message: " + userMessages.get(i));
        }


    }



}

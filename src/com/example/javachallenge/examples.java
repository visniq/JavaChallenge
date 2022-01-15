//package com.example.javachallenge;
//
//import java.util.Map;
//
//public class examples {
//    if(firstSelect == 1){
//        while(!wantEnd) {
//
//
//            //Printing out second menu
//
//
//            // Getting second choice
//            Integer secondSelect = scanner.nextInt();
//            switch (secondSelect) {
//
//                // Showing all contacts
//                case 1:
//                    for (Map.Entry<String, Integer> entry : contacts.entrySet()) {
//                        System.out.println(entry.getKey() + " " + entry.getValue());
//                    }
//                    //
//                case 2:
//
//                    // Adding contacts to your contact list
//                    while (!noMore) {
//                        System.out.println("Please specify a name: ");
//                        String newName = scanner.next();
//                        System.out.println("Please specify a number: ");
//                        Integer newNumber = scanner.nextInt();
//                        contacts.put(newName, newNumber);
//                        System.out.println("Do you want to add more contacts?   [Y/N]");
//                        if (scanner.next().equals("N")) {
//                            noMore = true;
//
//                        }
//                    }
//                    // Searching for a contact
//                case 3:
//                    // Deleting a contact
//                case 4:
//                    // Going back to previous menu
//                case 5:
//                    continue;
//
//            }
//        }else if(firstSelect.equals("2")){
//
//            Integer thirdSelect = scanner.nextInt();
//            switch(thirdSelect){
//                // See the list of all messages
//                case 1:
//                    //Send a new message
//                case 2:
//                    //Go back to previous menu
//                case 3:
//                    continue;
//            }
//        }else{
//            wantEnd = true;
//        }}
//    Integer secondSelect = scanner.nextInt();
//
//}
//}

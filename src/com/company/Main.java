package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        System.out.println("Welcome to our Island Survival Game! Press '1' to start game OR Enter '2' to quit the game: ");
        double response = input.nextDouble();

        if (response == 1) {
            System.out.println("Lets begin the game! ");
            System.out.println("Your plane has crashed on a desrted island in the middle of the Atlantic Ocean. Only you and your hamster survived the crash.");
            System.out.println("Whats your move?");
            System.out.println("\n");
            System.out.println("1: Panic and eat your pet hamster for survival");
            System.out.println("2: Build a hut made out of palm tree branches");
            System.out.println("3: Explore the island");
            System.out.println("\n------------------------------------------------------\n");

             choice = input.nextInt();

             if (choice == 1){
                 System.out.println("You are now not only full from the hamster but you are also full of guilt :(");
                 System.out.println("You hear a growling from the woods, press 1 to find out what it is or press 2 to run away");
                 double option3 = input.nextDouble();
                 if (option3 == 1) {
                     System.out.println("You walk towards the woods and a pair of glowing eyes appear... ITS A WOLF! You get eaten and the game ends here for you. Play again soon!");
                     System.exit(0);
                 } else if (option3 == 2) {
                     System.out.println("You choose the safer option, good job! You ran towards the beach and look at the glistening water. Do you create a fire? ");
                     System.out.println("Press 1 to create a fire and Press 2 to swim in the ocean");
                 } else {
                     System.out.println("You pressed the wrong button try again later");
                     System.exit(0);
                 }
             } else if (choice == 2){
                 System.out.println("You have constructed a nice looking raft lets test it out!");
             }
        } else {
            System.out.println("Lets try again later!");

        }


    }
}

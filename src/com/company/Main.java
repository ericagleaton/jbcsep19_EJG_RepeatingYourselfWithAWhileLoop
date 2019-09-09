package com.company;
//Repeating yourself with a while loop

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0

        secretNumber = 5;

        System.out.println("I'm thinking of a number between 1 and 10");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        while ( guess != secretNumber )
        {
            System.out.println("\n"+ guess + " is not the number.");
            if(guess>secretNumber) {
                System.out.println("Your number is too high, choose a number lower.\nTry again.\n");
            }
            else {
                System.out.println("Your number is too low choose a number higher.\nTry again.\n");
            }
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();
        }

        System.out.println("You are correct. You win a prize!");
        keyboard.close();
    }
}
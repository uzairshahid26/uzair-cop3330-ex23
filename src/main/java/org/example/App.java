/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;



public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        char choice;

        System.out.print("Is the car silent when you turn the key? ");
        choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'Y') {

            System.out.print("Are the battery terminals corroded? ");
            choice = scanner.next().toUpperCase().charAt(0);

            if (choice == 'Y')

                System.out.println ("Clean terminals and try starting again.");

            else

                System.out.println("Replace cables and try again.");

        } else {

            System.out.print("Does the car make a slicking noise? ");
            choice = scanner.next().toUpperCase().charAt(0);

            if (choice == 'y')

                System.out.println("Replace the battery.");

            else {

                System.out.print("Does the car crank up but fail to start? ");
                choice = scanner.next().toUpperCase().charAt(0);

                if (choice == 'y')

                    System.out.println("Check spark plug connections.");

                else {

                    System.out.print("Does the engine start and then die? ");
                    choice = scanner.next().toUpperCase().charAt(0);

                    if (choice == 'y') {

                        System.out.println("Does your car have fuel injection? ");
                        choice = scanner.next().toUpperCase().charAt(0);

                        if (choice == 'y')

                            System.out.println("Get it in for service.");

                        else

                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else {

                        System.out.println("This should not be possible.");

                    }

                }

            }

        }

        scanner.close();

    }

}





/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Initialize conversion
        int Gallon = 350;

        // Prompt
        System.out.println( "Enter Length: " );
        String Length = scan.nextLine();

        System.out.println( "Enter Width: " );
        String Width = scan.nextLine();

        // Convert strings to integers
        int intLength = Integer.parseInt(Length);
        int intWidth = Integer.parseInt(Width);

        // Calculations
        int area = intLength * intWidth;
        int GallonAmount = area / Gallon;

        // Using if statement to account for extra square footage
        if ((area % Gallon) != 0)
            GallonAmount++;

        // Output
        System.out.println("You will need to purchase "+GallonAmount+" gallons of paint to cover "+area+" square feet. ");


    }
}

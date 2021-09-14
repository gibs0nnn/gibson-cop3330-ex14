package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Input
        System.out.print("What is the order amount? ");
        double ordAmt = scanner.nextDouble();
        //ordAmt = Math.round(ordAmt * 100) / 100;
        System.out.print("What is the state? ");
        String state = scanner.next();

        //Subtotal Display
        System.out.println("The subtotal is $" + df.format(ordAmt) + ".");

        //Calculations
        double tax = ordAmt * .055;
        double total = Math.round((ordAmt + tax) * 100.0) / 100.0;

        //Condition for WI
        if(state.contains("WI")) {
            System.out.println("The tax is $" + tax + "." + "\nThe total is $" + total + ".");
        }
    }
}

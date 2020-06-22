/*
Shreeya Madhavanur
Import and create scanner
Import and create random
Prompt user for number of days
    Print "How many day's temperatures?"
define int days as answer
Create user control while loop for when it doesn't satisfy
redefine days as answer
create new array weather to store daily temps
initialize variable sum as 0
initialize variable average as 0
initialize variable count as 0
Create random randy bounded from 25 to 110 inclusive
Create for loop controlled by days and initialize i as 0
    a = i + 1
    do the random weather code + bound it
    Println: Day a's high temp is: + randy
    sum = sum + Weather[i]
average = sum/a

Printf average temp = average
Do a for loop for the above average
    Create if loop within that adds 1 to count if the weather [] is greater than average
 */
package com.company;

import java.util.*;


public class Activity {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //this is the scanner system that collects the number of days + user control
        Scanner input = new Scanner(System.in);
        Random randy = new Random();
        System.out.println("What are the number of days you want to input (must be between 2 and 100 inclusive): ");
        int days = input.nextInt();
        while (days < 2 || days > 100) {
            System.out.println("Your number is not between 2 and 100 inclusive. Try again");
            days = input.nextInt();
        }
        //created the array
        int[] Weather = new int[days];


        int sum = 0;
        double average = 0;
        int count = 0;
        int a;
        //first for loop for sum and average
        for (int i = 0; i < days; i++) {
            a = i + 1;
            Weather[i] = randy.nextInt(85) + 25;
            System.out.println("Day " + a + "'s high temp is " + Weather[i] + ".");
            sum = sum + Weather[i];
        }
        average = (double) sum / days;
        System.out.printf("Average temp = %.1f\n", average);
        //second for loop for which days are above average
        for (int i = 0; i < days; i++) {
            if (Weather[i] > average) {
                count = count + 1;
            }
        }
        System.out.println(count + " days were above average.");

    }
}

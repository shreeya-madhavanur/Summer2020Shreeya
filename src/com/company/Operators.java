/* Shreeya Madhavanur
Psuedocode:
Import java.util*
make scanner object thing --> Scanner screen = new Scanner(System.in);
prompt for double meal cost --> System.out.println("Type the cost of the meal here:");
set the double mealCost equal to screen.nextDouble()
prompt for int tip percent --> System.out.println("Type the percentage tip you are adding:");
set the int tipPercent equal to screen.nextInt()
prompt for int taxPercent --> System.out.println("Type the percentage tax you are adding:");
set the int taxPercent equal to screen.nextInt()
create new variable double tipValue and set equal to tipPercent*mealCost/100
create new variable double taxValue and set equal to taxPercent*mealCost/100
Create new double variable totalCost and set equal to mealCost + tipValue + taxValue
Println the rounded int total cost
 */

package com.company;

import java.util.Scanner;


public class Operators {
    //This is the Main Method
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Type the cost of the meal here:");
        double mealCost = screen.nextDouble();
        System.out.println("Type the percentage tip you are adding:");
        int tipPercent = screen.nextInt();
        System.out.println("Type the percentage tax you are adding:");
        int taxPercent = screen.nextInt();
        double tipValue = tipPercent*mealCost;
        tipValue = tipValue/100;
        double taxValue = taxPercent*mealCost;
        taxValue = taxValue/100;
        double totalCost = mealCost + tipValue + taxValue;
        totalCost = Math.round(totalCost);
        System.out.println((int) totalCost);
    }
    }


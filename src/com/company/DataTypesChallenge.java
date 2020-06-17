/* Shreeya Madhavanur
Psuedocode:
Import java.util*
Declare variable
Create int variable i and initialize
Create double variable d and initialize
Create String variable S and initialize
make scanner object thing --> Scanner screen = new Scanner(System.in);
prompt for integer --> System.out.println("Type your integer here:");
set the int integer equal to screen.nextInt()
prompt for double --> System.out.println("Type your double here:");
set the double doubly equal to screen.nextDouble()
prompt for message --> System.out.println("Type your input message here:");
set the String message equal to screen.nextLine()
Println sum of i plus int variable
Println sum of d plus double variable
Print string concatanation of s + " " + the string from input (which would be the variable "message")

 */

package com.company;

import java.util.Scanner;


public class DataTypesChallenge {
    //This is the Main Method
    public static void main(String[] args) {
int i = 4;
double d = 4.0;
String s = "Greenhill";
Scanner screen = new Scanner(System.in);
System.out.println("Type your integer here:");
int integer = screen.nextInt();
System.out.println("Type your double here:");
double doubly = screen.nextDouble();
System.out.println("Type your input message here:");
String message = screen.nextLine();
System.out.println(i+integer);
System.out.println(d+doubly);
System.out.println(s + " " + message);


    }

}

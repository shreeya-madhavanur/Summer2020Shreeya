/* Shreeya Madhavanur
Psuedocode:
1. Import java.util*
2. make scanner object thing --> Scanner input = new Scanner(System.in);
3. Make the main method
4. define n as a random
5. Create the String Answer
6. Create a while loop
    a. define new int integer as a random n within 1-137 inclusive
    b. println the integer
    c. insert output method
    d. Ask the user if they want to keep going
    e. define the string "answer" as the answer
7. Repeat loop while answer equals "Yes"
8. Create output method
        1. define the integer remainder as the n module 2
        2. create an if statement for if the remainder is one OR if it has a remainder 0 and is between 6-20 inclusive
            a. println weird
        3. create an else if statement for if the number has remainder 0 and is between 2-5 inclusive OR if it has remainder 0 and is greater than or equal to 20
            a. println Not weird


 */

package com.company;

import java.util.*;

//This is the class
public class IntroToConditionalStatementsChallenge {
    //This is the scanner object
    public static Scanner input = new Scanner(System.in);
    //This is the main
    public static void main(String[] args){
        //This is the random defined as n
        Random n = new Random();
        String answer;
        do{
            //the this defines the random as a bounded integer from 1-137 inclusive
            int integer = n.nextInt(137) + 1;
            System.out.println(integer);
            //This is the output integer which is listed below
            output(integer);
            //This is the user prompt
            System.out.println("Do you want to keep going? Type \"Yes\" or \"No\"");
            answer = input.next();
        }
        while (answer.equals("Yes"));

    }
    //this method determines the output
    public static void output(int integer){
        int remainder = integer % 2;
        if ((remainder == 1) || (integer >= 6 && integer <= 20)) {
            System.out.println("Weird");
        } else if ((integer >= 2 && integer <= 5) || (integer >= 20)) {
            System.out.println("Not Weird");
        }

    }
}

/* Shreeya Madhavanur
Psuedocode:
1. Import java.util*
2. make scanner object thing --> Scanner screen = new Scanner(System.in);
3. prompt for integer between 1 and 137 inclusive
4. define the integer n as the answer (screen.nextInt thing)
5. make a while loop containing the if statement for if the integer is above 137
    a. print that the integer is invalid and must be less than or equal to 137 + try again
    b. define their input response as the new n
6. make a while loop containing the if statement for if the integer is below 1
    a. print that the integer is invalid and must be greater than or equal to 1 + try again
    b. define their input response as the new n
7. define the integer remainder as the n module 2
8. create an if statement for if the remainder is one OR if it has a remainder 0 and is between 6-20 inclusive
    a. println weird
9. create an else if statement for if the number has remainder 0 and is between 2-5 inclusive OR if it has remainder 0 and is greater than or equal to 20
    a. println Not weird

 */

package com.company;

import java.util.Scanner;


public class IntroToConditionalStatementsChallenge {
    //This is the Main Method
    public static void main(String[] args) {
       //User control
        Scanner screen = new Scanner(System.in);
        System.out.println("Type in an integer between 1 and 137 inclusive:");
        int n = screen.nextInt();
      /*i had to do this weird if statement within a while loop because otherwise my program wouldn't work and acted
      erratically. I don't exactly know why, but putting an if loop within the while loop made my program work again.*/
        do{ if (n > 137){
           System.out.println("Your integer needs to be LESS than or EQUAL TO 137; try again");
           n = screen.nextInt();
       }}while (n > 137);

       do{ if(n < 1){
           System.out.println("Your integer needs to be GREATER than or EQUAL TO 1; try again");
           n = screen.nextInt();
       }}while (n < 1);
    //providing the output
        int remainder = n%2;
        if ((remainder == 1) || ( n>=6 && n<=20)){
            System.out.println("Weird");
        }
        else if (( n>=2 && n<=5)||(n>=20))
    {
            System.out.println("Not Weird");
        }

        }

    }



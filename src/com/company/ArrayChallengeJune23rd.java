/* Shreeya Madhavanur
Psuedocode:
1. Import java.util*
In the main:
    2. Create new random ArraySize
    3. Create new random Int
    4. Define int number as ArraySize.nextInt bounded from 5 - 10
    5. Println “you get” number “integers”
    6. Define new integer array RandNumbers as a new int [number]
    7. Create a for loop controlled by number and initialize i as 0
        a. Define RandNumbers array as the random array size but bounded from 11 to 99 (so that the numbers are limited to 2 indexes each)
    8. Println the RandNumbers Array to string
    9. Define int a as the random Int bounded by the integer number
    10. Define int b as the random Int bounded by the integer number
    11. Call back the Swap method that you will create (this is where it will go) and in parenthesis, put (RandNumbers, i, j)
    12. Println “we swapped integers at indexes” i “and” j
In the public static int array method swap with (RandNumbers, int i, int j):
    13. Define int temp as RandNumbers at element i
    14. Define RandNumbers at element i as RandNumbers at element j
    15. Define RandNumbers at element j as temp
    16. Println array RandNumbers to string
    17. Return RandNumbers


 */

package com.company;

import java.util.*;


public class ArrayChallengeJune23rd
{

    public static void main(String[] args)
    {
       Random ArraySize = new Random(); // created a random which determines amount of numbers in the array
       Random Int = new Random(); // created a random which will determine which indexes are swapped
       int number = ArraySize.nextInt(5)+5; //variable number = random int between 5-10 which = total #s in array
       System.out.println("You get " + number + " integers"); // so that we know how many integers we get
       int [] RandNumbers  = new int [number]; // created a new array called RandNumbers of size V:number
       for (int i = 0; i < number; i++) //for loop to create the random numbers in the array, repeats V:number times
       {
           RandNumbers[i] = ArraySize.nextInt(89)+10;//puts a Rand int from 10-99 in array slot V:i
       }
        System.out.println(Arrays.toString(RandNumbers)); // so we know the original array
       int i = Int.nextInt(number); // picks the 1st random index to swap (from 0 - V:number) and defines as i
       int j = Int.nextInt(number); // picks the 2nd random index to swap (from 0 - V:number) and defines as j
       Swap(RandNumbers,i, j); // calls Swap method back
       System.out.println("We swapped integers at indexes " + i + " and " + j); // so we know which indexes swapped
    }

    public static int[] Swap(int[] RandNumbers, int i, int j) // Sent Array RandNumbers, int i, and int j to Swap Method
    {
        int temp = RandNumbers[i];
        RandNumbers[i] = RandNumbers[j];
        RandNumbers[j] = temp;
        System.out.println(Arrays.toString(RandNumbers)); // prints the swapped array
        return RandNumbers; // return to main
    }

}



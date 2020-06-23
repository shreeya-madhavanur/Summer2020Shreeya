/* Shreeya Madhavanur
Psuedocode:
1. Import java.util*
2. make scanner object thing --> Scanner screen = new Scanner(System.in);
Main:
    3. Prompt for T
    4. Do while loop for T
        a. As long as t <1 or t>10
        b. println "T must be between 1 and 10 inclusive, try again"
        c. define the int T as the answer (screen.nextLine() thing)
    5. Create string Input and define it as new string --> do again for output
    6. For loop --> initialize i as zero and repeat and add 1 as long as i< T
        a. prompts for a word
        b. define the answer as NewWord
        c. create a while loop within the for loop
            1. Conditions: while New word is less than 2 or greater than 1000, prompt the user to try again
            2. Define answer as NewWord
        d. define input array element i as new word
    7. Call the ArrayCharMethod Method
    8. Create for loop and initialize i as 0 and repeat and add 1 as long as i<T
        a. println output of element i
    9. Create a public static void called ArrayCharMethod and send the string input[], string output[], and int T
        a. create a for loop and initialize i as 0 and repeat as long as i<T
            1. define the string word as the input of element i
            2. create the string compute (define it as new string)
            3. define int p as 0
            4. define int len as length of NextWord
                a. create a do while loop for evens
                    1. do: redefine compute as compute + charAt index p
                    2. do: redefine p as p+2
                    3. while: p is less than len
        d. redefine compute as compute + space
        e. define int q as 1
        f. create a do while loop for odds
            1. do: redefine compute as compute + charAt index q
            2. do: redefine q as q+2
            3. while: q is less than len
        g. define output of element i as compute


 */

package com.company;

import java.util.*;


public class StringChallengeWithArrays
{
    public static Scanner screen = new Scanner(System.in);

    //This is the Main Method
    public static void main(String[] args)
    {
        Scanner screen = new Scanner(System.in);
        System.out.println("Please enter an integer between 1 (inclusive) and 10 (inclusive). This will be the amount of words you want to process.");
        int T = screen.nextInt();
        while (T < 1 || T > 10)
        {
            System.out.println("Your integer is not between 1 and 10 inclusive. Try again.");
            T = screen.nextInt();
        }

//creating + defining string arrays
        String[] Input = new String[T];
        String[] Output = new String[T];

        //for loop to get words
        for (int i = 0; i < T; i++)
        {
            System.out.println("Enter a word");
            String NewWord = screen.next();
            while (NewWord.length() <= 2 || NewWord.length() >= 1000)
            {
                System.out.println("Your length of your word is not between 2 characters (exclusive) and 1000 characters (exclusive). Try again.");
                NewWord = screen.next();
            }
          //sends new word to input slot i
            Input[i] = NewWord;

        }
            //calls the ArrayCharMethod that scrambles the letters
        ArrayCharMethod(Input, Output, T);
        for (int i = 0; i < T; i++)
        {
            //prints out the scrambled letters
            System.out.println(Output[i]);
        }

    }


    //This is the ArrayCharMethod which scrambles the letters; I am giving it the String[] Input, String[] Output, and int T
    public static void ArrayCharMethod(String[] Input, String[] Output, int T)
    {
        for (int i = 0; i < T; i++)
        {
            String Word = Input[i];
            String Compute = new String();
            //Evens
            int p = 0;
            int len = Word.length();
            do
            {
                Compute = Compute + Word.charAt(p);
                p = p + 2;
            }
            while (p < len);
            Compute = Compute + " ";
            //odds
            int q = 1;
            do
             {
                Compute = Compute + Word.charAt(q);

                q = q + 2;
            }
            while (q < len);
            //each time the loop runs, it sends compute to output slot i that corresponds with the original word in input slot i
            Output[i] = Compute;

        }
    }
}



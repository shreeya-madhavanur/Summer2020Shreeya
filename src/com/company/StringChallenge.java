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
    5. Create string S and define it as new string
    6. For loop --> initialize i as one and repeat and add 1 as long as i< = T
        a. prompts for a word
        b. define the answer as NewWord
        c. create a while loop within the for loop
            1. Conditions: while New word is less than 2 or greater than 1000, prompt the user to try again
            2. Define answer as NewWord
        d. Define S as S+NewWord+" "
    7. create int indexOf
    8. Create for loop and initialize i as one and repeat and add 1 as long as i<=T
        a. define indexOf as space in string S
        b. Define string NextWord as a substring of string S from index 0 to indexOf
        c. Insert the method called CharMethod which will do all the reorganizing of the letters
        d. Redefine Substring as everything after the IndexOf
    9. Create a public static void called CharMethod and send the variable NextWord
        a. define int p as 0
        b. define int len as length of NextWord
        c. create a do while loop for evens
            1. do: print the character in NextWord at index p
            2. do: redefine p as p+2
            3. while: p is less than len
        d. print a space
        e. define int q as 1
        f. create a do while loop for odds
            1. do: print the characters in NextWord at index q
            2. do: redefine q as q+2
            3. while: q is less than len
        g. println a space


 */

package com.company;

import java.util.Scanner;


public class StringChallenge {
    public static Scanner screen = new Scanner(System.in);

    //This is the Main Method
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Please enter an integer between 1 (inclusive) and 10 (inclusive). This will be the amount of words you want to process.");
        int T = screen.nextInt();
        while (T < 1 || T > 10) {
            System.out.println("Your integer is not between 1 and 10 inclusive. Try again.");
            T = screen.nextInt();
        }

            String S = new String();
            for (int i = 1; i <= T; i++) {
                System.out.println("Enter a word");
                String NewWord = screen.next();
                while(NewWord.length()<=2 || NewWord.length()>=1000)
                {
                   System.out.println("Your length of your word is not between 2 characters (exclusive) and 1000 characters (exclusive). Try again.");
                   NewWord = screen.next();
                }
                //System.out.println("Your word is " + NewWord);
                S = S + NewWord + " ";
                //System.out.println("Your concat word is " + S);
            }
            int indexOf; //= S.indexOf(" ");  First index of Space
            for (int i = 1; i <= T; i++) {
                indexOf = S.indexOf(" "); // First index of Space
                String NextWord = (S.substring(0, indexOf));
               //return type is void
                CharMethod(NextWord);

                S = S.substring(indexOf + 1);
                //System.out.println(S);
            }

    }

    public static void CharMethod(String NextWord) {
        int p = 0;
        int len = NextWord.length();
        do{
            System.out.print(NextWord.charAt(p));
            p = p + 2;
        } while(p < len);
        System.out.print(" ");
        int q = 1;
        do{
            System.out.print(NextWord.charAt(q));
            q = q + 2;
        } while(q < len);
        System.out.println(" ");
        //returning void
        return;
    }
}
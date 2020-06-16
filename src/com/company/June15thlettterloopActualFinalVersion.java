//Pseudocode:
//1. Create the scanner object
//2. Print a message for the user
//3. Create string object for the message
//4. Get the message using nextLine()
//5. Print System.out.print (“Type your word or phrase here:”) to get the user input
//6. Find the first word
//7. Int indexOfSpace= firstWord.indexOf(“ “)
//8. Find length of first word
//9. Also isolate the message
//10. With index (indexOf())
//11. Counter = 0;
//12. For loop control by length of the first word	index = 1
//13. Letter → charAt(indexloop)
//14. Count++ While index>-1 repeat the following loop When index = 0, use that letter and make it ++
//15. Check if you have the same letter in the first word in the message
//              a. for (int i = 0; i < someString.length(); i++) {
//                 if (someString.charAt(i) == someChar) {
//                 count++;  }
//16. If it is true
//17. Count++
//18. System.out.println string ( “The letter “ + charAt(whatever index it is) + “appears in the message ” + Count++ answer + “times.”
//19. Eliminate that letter from the first word
//20. First word = first word.substring(0, index you found your second letter) + first word.substring (index you found your second letter +1)
//21. Use while to repeat the process

package com.company;

import java.util.Scanner;


public class June15thlettterloopActualFinalVersion {
    //This is the Main Method
    public static void main(String[] args) {
        //This is the scanner, I defined the user's answer as the variable "FullName"
        Scanner name = new Scanner(System.in);
        System.out.println("Type your sentence");
        String phrase = name.nextLine();
        message1(phrase);
    }

    public static void message1(String phrase) {
        int indexOf = phrase.indexOf(" ");
        //Isolating first word
        String FirstWord = (phrase.substring(0, indexOf + 1));
        int len = FirstWord.length();
        char let;
        int count = 0;
        for (int index = 0; index < len; index++) {
            let = FirstWord.charAt(index);
            if (let != ' ') {
                count++;
                String temp = phrase.substring(index + 1);
                indexOf = temp.indexOf(let);
               //while loop is used instead of for because the loop needs to keep repeating
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(let);
                }
                phrase = phrase.replace(let, ' ');
                FirstWord = FirstWord.replace(let, ' ');
                System.out.println(let + " " + count);

                count = 0;

                }
            }
        }
    }
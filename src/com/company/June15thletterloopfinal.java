package com.company;

import java.util.Scanner;

public class June15thletterloopfinal {
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
package com.company;
import java.util.*;

//S. Diddy MADHAVANUR Shreeya-izzle --> what my name should look like

public class GangstaNameFinal {
    //This is the Main Method
    public static void main(String[] args) {
    //This is the scanner, I defined the user's answer as the variable "FullName"
        Scanner name = new Scanner(System.in);
        System.out.println("What is your full name?");
        String FullName = name.nextLine();
        RapperName(FullName);
    }

    //This is the string with all the index and char which changes based on Full Name which is here as word
    public static void RapperName(String word) {
        char letter = word.charAt(0);
        int indexOf = word.indexOf(" ")+1;
        String LastName1 = (word.substring(indexOf));
        String LastName = (LastName1.toUpperCase());
        String FirstName = (word.substring(0,indexOf-1));
    //I subtracted 1 from index to get rid of the space between Shreeya and -izzle

        System.out.println( "Your Gangsta Name is: \"" + letter + "." + " Diddy" + " " + LastName + " " + FirstName + "-izzle\"");
        }
    }


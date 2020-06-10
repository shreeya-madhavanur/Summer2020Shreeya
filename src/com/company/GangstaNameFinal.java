package com.company;

//S. Diddy MADHAVANUR Shreeya-izzle --> what my name should look like

public class GangstaNameFinal {
//This is the Main Method
    public static void main(String[] args) {
        String FullName = "Shreeya Madhavanur";
        RapperName(FullName);
    }
//This is the string with all the index and char which changes based on Full Name which is here as word
    public static void RapperName(String word) {
        char letter = word.charAt(0);
        System.out.print(letter + "." + " Diddy");
        int indexOf = word.indexOf(" ");
       System.out.print(word.substring(indexOf).toUpperCase());
        System.out.print(" " + word.substring(0,indexOf));
        System.out.print("-izzle");
        }
    }


package com.company;

public class GangstaName {

    public static void main(String[] args) {
        String FullName = "Shreeya Madhavanur";
        char letter = FullName.charAt(0);
        String FirstName = FullName.substring(8).toUpperCase();
        String LastName = FullName.substring(0,8);
        System.out.print(letter + ". " + "Diddy " + FirstName + " " + LastName + "-izzle");
    }
    }


//S. Diddy MADHAVANUR Shreeya-izzle
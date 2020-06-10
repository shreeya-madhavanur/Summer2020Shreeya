package com.company;

public class LettersAssignmentJune9th {
    //This is the global variable for sizing
    public static final int SIZE = 6;
//This is the main method
    public static void main(String[] args) {
        for (int LimitForLetters = SIZE; LimitForLetters >= 1; LimitForLetters--) {
        for (int let=0; let<LimitForLetters; let++){
            System.out.print((char)(65+let));
        }
        System.out.println(" ");
        }
        for (int LimitForLetters = 1; LimitForLetters<=SIZE; LimitForLetters++){
        for (int let = 0; let<LimitForLetters; let++){
            System.out.print((char)(65+let));
        }
        System.out.println(" ");
        }
    }
}
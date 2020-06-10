package com.company;

public class Challenge2ShreeyaV2 {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        HorizontalBorder();
        TopHalf();
        BottomHalf();
        HorizontalBorder();
        BottomHalf();
        TopHalf();
        HorizontalBorder();
    }

    public static void HorizontalBorder() {
        System.out.print("+");
        for (int dash = 0; dash < 2 * SIZE + 1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void TopHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 0; space < SIZE - line + 1; space++) {
                System.out.print(" ");
            }
            for (int slash = 0; slash < line - 1; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int backslash = 0; backslash < line - 1; backslash++) {

                System.out.print("\\");
            }
            for (int space = 0; space < SIZE - line + 1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void BottomHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 0; space < line; space++) {
                System.out.print(" ");
            }
            for (int slash = 0; slash < SIZE - line; slash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int backslash = 0; backslash < SIZE - line; backslash++) {

                System.out.print("/");
            }
            for (int space = 0; space < line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
package com.company;

public class ClassworkJune6thV2 {

    public static void main(String[] args) {
       HorizontalBorder();
        TopHalf();
        BottomHalf();
        HorizontalBorder();
    }
    public static void HorizontalBorder(){
       System.out.print("#");
        for(int border = 1; border<=16; border++){
            System.out.print("=");
        }
            System.out.println("#");
        }

    public static void TopHalf() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int space = 1; space <= -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= 4 * line - 4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= -2 * line + 8; space++) {

                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void BottomHalf(){
        for(int line = 1; line<5; line++){
            System.out.print("|");
        for(int space = 1; space <= 2 * line - 2 ; space++) {
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot = 1; dot<=-4*line +16; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        for(int space = 1; space <= 2* line -2; space++){
            System.out.print(" ");
        }
        System.out.println("|");
        }

    }
}

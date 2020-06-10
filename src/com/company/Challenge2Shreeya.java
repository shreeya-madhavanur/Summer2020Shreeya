package com.company;

public class Challenge2Shreeya {

    public static void main(String[] args) {
       HorizontalBorder();
        TopHalf();
       BottomHalf();
       HorizontalBorder();
       BottomHalf();
       TopHalf();
       HorizontalBorder();
    }
    public static void HorizontalBorder(){System.out.println("+---------+");}
    public static void lineOne(){System.out.println("|    *    |");}
      public static void lineTwo(){System.out.println("|   /*\\   |");}
      public static void lineThree(){System.out.println("|  //*\\\\  |");}
      public static void lineFour(){System.out.println("| ///*\\\\\\ |");}

    public static void TopHalf(){
        lineOne();
        lineTwo();
        lineThree();
        lineFour();}
        public static void ReverseTwo(){System.out.println("|   \\*/   |");}
        public static void ReverseThree(){System.out.println("|  \\\\*//  |");}
        public static void ReverseFour(){System.out.println("| \\\\\\*/// |");}
        public static void BottomHalf(){ReverseFour();
            ReverseThree();
            ReverseTwo();
            lineOne();
            }
}

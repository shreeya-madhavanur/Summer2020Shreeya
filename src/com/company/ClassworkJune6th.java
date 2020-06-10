package com.company;

public class ClassworkJune6th {

    public static void main(String[] args) {
       TopHalf();
       BottomHalf();
    }
    public static void HorizontalBorder(){System.out.println("#================#");}
    public static void lineOne(){System.out.println("|      <><>      |");}
      public static void lineTwo(){System.out.println("|    <>....<>    |");}
      public static void lineThree(){System.out.println("|  <>........<>  |");}
      public static void lineFour(){System.out.println("|<>............<>|");}

    public static void TopHalf(){HorizontalBorder();
        lineOne();
        lineTwo();
        lineThree();
        lineFour();}
        public static void BottomHalf(){lineFour();
            lineThree();
            lineTwo();
            lineOne();
            HorizontalBorder();}
}

package com.company;

public class Stringpractice {

    public static void main(java.lang.String[] args) {
        String name = "Shreeya";
        SayHi(name);
        String teacher = "Shreeya Madhavanur";
        SayHi(teacher);
        String student = "potato";
        SayHi(student);
        String letter = "I";
        SayHi(letter);

    }

    public static void SayHi(String word) {
        System.out.println("Hi " + word.toUpperCase());
        int len = word.length();
        System.out.println("Your name is " + len + " characters long");
        int indexOf = word.indexOf("A");
        System.out.println("The letter A is at index " + indexOf);
        if (indexOf > 0) {
            String partial = word.substring(indexOf);
            System.out.println(partial);

            if (word.length() > 4) {
                partial = word.substring(1, indexOf);
                System.out.println(partial);
                char letter = word.charAt(4);
            }
        }

    }
}

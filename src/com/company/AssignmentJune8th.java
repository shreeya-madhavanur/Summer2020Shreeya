package com.company;

public class AssignmentJune8th {

    public static void main(String[] args) {
        int dish1= 38;
        int dish2= 40;
        int dish3= 30;
        int subtotal= dish1+dish2+dish3;
        final double TaxRate= 0.08;
        final double TipRate = 0.15;
        final double Tip= subtotal * TipRate;
        final double Tax= subtotal * TaxRate;

        System.out.println("Subtotal:" + subtotal);
        System.out.println("Tax:"+ Tax);
        System.out.println("Tip:" + Tip);
        System.out.println("Total:" + subtotal + Tip + Tax);
    }
}
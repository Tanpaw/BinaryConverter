package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int decimal = numberInput(input);
        binaryConv(decimal);

    }

    public static int numberInput(Scanner input) {
        System.out.println("Input a decimal number:");
        int decimal = input.nextInt();
        return decimal;
    }

    public static void binaryConv(int decimal) {
        String binary = "";
        if (decimal<=0) {
            System.out.println("Please input a positive number");
        } else {
            while (decimal > 0) {
                binary = (decimal % 2) + binary;
                decimal = decimal / 2;
            }
            System.out.println("Your number converted to binary number: " + binary);
        }

    }


}

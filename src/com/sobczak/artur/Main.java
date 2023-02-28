package com.sobczak.artur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for calculate: ");

        Addition addition = new Addition(scanner.nextInt(), scanner.nextInt());
        System.out.println(addition.additionalMethod(addition));

        Subtraction subtraction = new Subtraction(scanner.nextInt(), scanner.nextInt());
        System.out.println(subtraction.substractionMethod(subtraction));


    }
}

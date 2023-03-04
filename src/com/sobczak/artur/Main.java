package com.sobczak.artur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplying multiplying = new Multiplying();
        char character;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for calculate: ");


        Data data = new Data(scanner.nextInt());
        System.out.println("Please enter kind of opperation: \n+: Addition\n-: Subtration\n/: Division\n*: Multiplying\n= Result");
        character = scanner.next().charAt(0);


        while (character == '+'){
            System.out.println(addition.additionalMethod(data));
            character = 0;
        }

        while (character == '-'){
            System.out.println(subtraction.substractionMethod(data));
            character = 0;
        }

    }
}

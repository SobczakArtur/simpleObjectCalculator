package com.sobczak.artur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplying multiplying = new Multiplying();

        char character;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the number for calculate: ");
//        Data data = new Data(scanner.nextInt());
//        System.out.println("Please enter kind of opperation: \n+: Addition\n-: Subtration\n/: Division\n*: Multiplying\n= Result");
//        character = scanner.next().charAt(0);



        boolean access = true;
        while (access) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number for calculate: ");
            Data data = new Data(scanner.nextInt());
            System.out.println("Please enter kind of opperation: \n+: Addition\n-: Subtration\n/: Division\n*: Multiplying\n= Result");
            character = scanner.next().charAt(0);

            if (character == '+') {
                addition.additionalMethod(data);
            } else if (character == '-') {
                subtraction.substractionMethod(data);
            } else if (character == ':') {
                division.divisionMethod(data);
            } else if (character == '*') {
                multiplying.multiplyingMethod(data);
            } else if (character == '=') {
                System.out.print("Result of the calculation is: ");
                System.out.println(data.getResult());
                access = false;
            }
        }
    }
//    private Data getNumber(){
//        Scanner scanner = new Scanner(System.in);
//        Data data = new Data(scanner.nextInt());
//        return data;
//    }
//
//    private char getCharakter(){
//        char character;
//        Scanner scanner = new Scanner(System.in);
//        return character = scanner.next().charAt(0);
//    }


}

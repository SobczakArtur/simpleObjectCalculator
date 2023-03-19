package com.sobczak.artur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplying multiplying = new Multiplying();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers for calculate: ");
        System.out.println("Kind of opperation: \n+ Addition\n- Subtration\n: Division\n* Multiplying\n= Result");

        Data data = new Data();
        char character = 0;
        boolean accessOperation = true;
        boolean accessNumber = true;
        boolean accessChar2 = true;


        while (accessNumber) {
            try {
                data.setNumber1(getInt());
                accessNumber = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid data" + "\nPlease enter a numerical value");
            }
        }


        while (accessOperation) {

            while (accessChar2) {
                character = getChar().charAt(0);
                if (character != '+' && character != '-' && character != ':' && character != '*' && character != '=' ) {
                    System.out.println("This is invalid sign,\nplease use one of the correct.");
                } else {
                    accessChar2 = false;
                }
            }

                if (character == '+') {
                    data.setNumber2(getInt());
                    addition.additionalMethod(data);
                    accessChar2 = true;
                } else if (character == '-') {
                    data.setNumber2(getInt());
                    subtraction.substractionMethod(data);
                    accessChar2 = true;
                } else if (character == ':') {
                    data.setNumber2(getInt());
                    division.divisionMethod(data);
                    accessChar2 = true;
                } else if (character == '*') {
                    data.setNumber2(getInt());
                    multiplying.multiplyingMethod(data);
                    accessChar2 = true;
                } else if (character == '=') {
                    System.out.print("Result of the calculation is: ");
                    System.out.println(data.getResult());
                    accessOperation = false;
                }
        }
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getChar() {
        return new Scanner(System.in).nextLine();
    }
}

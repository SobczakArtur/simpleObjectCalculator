package com.sobczak.artur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations {

    public void operationsMethod(){

    Addition addition = new Addition();
    Subtraction subtraction = new Subtraction();
    Division division = new Division();
    Multiplying multiplying = new Multiplying();
    Data data = new Data();
    char character = 0;
    boolean accessOperation = true;
    boolean accessNumber = true;
    boolean accessChar = true;

        while (accessNumber) {
        try {
            data.setNumber1(getInt());
            accessNumber = false;
        } catch (InputMismatchException e) {
            System.out.println("Invalid data" + "\nPlease enter a numerical value");
        }
    }

        while (accessOperation) {

        while (accessChar) {
            character = getChar().charAt(0);
            if (character != '+' && character != '-' && character != ':' && character != '*' && character != '=') {
                System.out.println("This is invalid sign,\nplease use one of the correct.");
            } else {
                accessChar = false;
            }
        }


        accessNumber = true;
        if (character == '+') {
            while (accessNumber) {
                try {
                    data.setNumber2(getInt());
                    accessNumber = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data" + "\nPlease enter a numerical value");
                }
            }
            addition.additionalMethod(data);
            accessChar = true;
        } else if (character == '-') {
            while (accessNumber) {
                try {
                    data.setNumber2(getInt());
                    accessNumber = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data" + "\nPlease enter a numerical value");
                }
            }
            subtraction.substractionMethod(data);
            accessChar = true;
        } else if (character == ':') {
            while (accessNumber) {
                try {
                    data.setNumber2(getInt());
                    accessNumber = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data" + "\nPlease enter a numerical value");
                }
            }
            division.divisionMethod(data);
            accessChar = true;
        } else if (character == '*') {
            while (accessNumber) {
                try {
                    data.setNumber2(getInt());
                    accessNumber = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data" + "\nPlease enter a numerical value");
                }
            }
            multiplying.multiplyingMethod(data);
            accessChar = true;
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

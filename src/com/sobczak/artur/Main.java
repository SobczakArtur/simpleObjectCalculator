package com.sobczak.artur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplying multiplying = new Multiplying();

        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers for calculate: ");
        System.out.println("Kind of opperation: \n+ Addition\n- Subtration\n: Division\n* Multiplying\n= Result");

        Data data = new Data();
        boolean accessChar = true;
        boolean accessNumber = true;


        while (accessNumber) {
            try {
                data.setNumber1(getInt());
                accessNumber = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid data" + "\nPlease enter a numerical value");
            }
        }


        while (accessChar) {

            character = getChar().charAt(0);

                if (character == '+') {
                    data.setNumber2(getInt());
                    addition.additionalMethod(data);
                } else if (character == '-') {
                    data.setNumber2(getInt());
                    subtraction.substractionMethod(data);
                } else if (character == ':') {
                    data.setNumber2(getInt());
                    division.divisionMethod(data);
                } else if (character == '*') {
                    data.setNumber2(getInt());
                    multiplying.multiplyingMethod(data);
                } else if (character == '=') {
                    System.out.print("Result of the calculation is: ");
                    System.out.println(data.getResult());
                    accessChar = false;
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

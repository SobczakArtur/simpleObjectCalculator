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
        try {
            data.setNumber1(scanner.nextInt());
        } catch (InputMismatchException e){
        System.out.println("Invalid data" + "\nPlease enter a numerical value");
    }


        boolean access = true;
        while (access) {

            character = scanner.next().charAt(0);

                if (character == '+') {
                    data.setNumber2(scanner.nextInt());
                    addition.additionalMethod(data);
//                data.setNumber1(0);
                } else if (character == '-') {
                    data.setNumber2(scanner.nextInt());
                    subtraction.substractionMethod(data);
//                data.setNumber1(0);
                } else if (character == ':') {
                    data.setNumber2(scanner.nextInt());
                    division.divisionMethod(data);
//                data.setNumber1(0);
                } else if (character == '*') {
                    data.setNumber2(scanner.nextInt());
                    multiplying.multiplyingMethod(data);
//                data.setNumber1(0);
                } else if (character == '=') {
                    System.out.print("Result of the calculation is: ");
                    System.out.println(data.getResult());
                    access = false;
                }

        }
    }
}

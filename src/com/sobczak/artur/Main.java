package com.sobczak.artur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for calculate: ");

        Addition data = new Addition(scanner.nextInt(), scanner.nextInt());
        System.out.println(data.additionalMethod(data));


    }
}

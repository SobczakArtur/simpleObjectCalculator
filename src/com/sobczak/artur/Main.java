package com.sobczak.artur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operations operations = new Operations();
        System.out.println("Please enter the numbers for calculate: ");
        System.out.println("Kind of opperation: \n+ Addition\n- Subtration\n: Division\n* Multiplying\n= Result");
        operations.operationsMethod();
    }
}
package com.sobczak.artur;

public class Subtraction {

    public int substractionMethod(Data data){
        System.out.print("Result of the substration is: ");
        data.result = data.result - data.getData1();
        return data.result;
    }

}

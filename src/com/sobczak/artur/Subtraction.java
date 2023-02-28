package com.sobczak.artur;

public class Subtraction extends Data{


    public Subtraction(int data1, int data2) {
        super(data1, data2);
    }

    public int substractionMethod(Data data){
        System.out.println("Result of the substration is: ");
        return result += getData1() - getData2();
    }

}

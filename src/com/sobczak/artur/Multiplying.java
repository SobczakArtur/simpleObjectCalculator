package com.sobczak.artur;

public class Multiplying extends Data {

    public Multiplying(int data1, int data2) {
        super(data1, data2);
    }

    public int multiplyingMethod(Data data){
        System.out.println("Result of the multiplaying is: ");
        return result += getData1() * getData2();
    }

}

package com.sobczak.artur;

public class Addition extends Data {

    public Addition(int data1, int data2) {
        super(data1, data2);
    }

    public int additionalMethod(Data data){
        System.out.println("Result of the additional is: ");
        return result += getData1() + getData2();
    }

}

package com.sobczak.artur;

public class Multiplying {

    public int multiplyingMethod(Data data){
        System.out.print("Result of the multiplaying is: ");
        data.result = data.result * data.getData1();
        return data.result;
    }

}

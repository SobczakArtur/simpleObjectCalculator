package com.sobczak.artur;

public class Multiplying {

    public double multiplyingMethod(Data data){
//        System.out.print("Result of the calculation is: ");
        if (data.result > 0) {
            data.result = data.getResult() * data.getNumber2();
            return data.result;
        } else {
            data.result = data.getNumber1() * data.getNumber2();
            return data.result;
        }
    }

}

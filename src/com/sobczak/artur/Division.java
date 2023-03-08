package com.sobczak.artur;

public class Division {

    public int divisionMethod(Data data){
//        System.out.print("Result of the calculation is: ");
        data.result = data.result / data.getData1();
        return data.result;
    }

}

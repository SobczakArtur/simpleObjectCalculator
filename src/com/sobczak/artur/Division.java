package com.sobczak.artur;

public class Division {

    protected double divisionMethod(Data data){
        if (data.result > 0 || data.result < 0) {
            data.result = data.getResult() / data.getNumber2();
            return data.result;
        } else {
            data.result = data.getNumber1() / data.getNumber2();
            return data.result;
        }
    }

}

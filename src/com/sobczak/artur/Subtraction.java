package com.sobczak.artur;

public class Subtraction {

    protected double substractionMethod(Data data) {
        if (data.result > 0 || data.result < 0) {
            data.result = data.getResult() - data.getNumber2();
            return data.result;
        } else {
            data.result = data.getNumber1() - data.getNumber2();
            return data.result;
        }
    }
}

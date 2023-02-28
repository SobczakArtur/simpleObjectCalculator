package com.sobczak.artur;

public class Division extends Data{

    public Division(int data1, int data2) {
        super(data1, data2);
    }

    public int divisionMethod(Data data){
        System.out.println("Result of the division is: ");
        return result += getData1() / getData2();
    }

}

package com.company.class2321.methodoverloading;

public class CalculatorTester {


    public static void main(String[] args) {
        /*Calculator calculator=new Calculator();
        calculator.addDouble(15.2,12.5);*/

        ImprovedCalculator improvedCalculator=new ImprovedCalculator();
        improvedCalculator.add(15.0,14.5);
        improvedCalculator.add(15,14);
        int[] arr={10,20,30,};
        improvedCalculator.add(arr);
        improvedCalculator.add(15,15,15);
        improvedCalculator.add(15,14,15,15);
        improvedCalculator.add(15,14,15,15,15);
        improvedCalculator.add(15,14);

    }
}

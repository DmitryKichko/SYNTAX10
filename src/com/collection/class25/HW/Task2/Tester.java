package com.collection.class25.HW.Task2;

public class Tester {


    public static void main(String[] args) {


        CreditCard creditCard = new CreditCard(1000);
        creditCard.calculateInterest();

        Visa visa = new Visa(1000);
        visa.calculateInterest();

        AX ax = new AX(1000);
        ax.calculateInterest();


        CreditCard creditCard1 = new AX(120);
        creditCard1.calculateInterest();


    }
}

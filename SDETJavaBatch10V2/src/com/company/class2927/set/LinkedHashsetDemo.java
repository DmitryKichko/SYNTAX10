package com.company.class2927.set;


import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");
        System.out.println(fruits);
    }

}

package com.company.class2826.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Abdul");

        for (String name: list
        ) {
            System.out.println(name); 
        }
        System.out.println("================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

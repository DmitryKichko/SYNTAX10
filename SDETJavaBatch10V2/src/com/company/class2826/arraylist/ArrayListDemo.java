package com.company.class2826.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        int [] arr = {10, 20};
        int [] arr2 = new int [20];
        arr2[2] = 1452;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hilal"); // "Hilal" - это String
        arrayList.add("Eli");
        arrayList.add("Jam");
        arrayList.add("Tes");
       // arrayList.add(50);
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.set(2, "1000");
        System.out.println(arrayList.get(2));
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10); // 10 это Integer


    }

}

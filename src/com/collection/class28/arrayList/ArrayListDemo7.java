package com.collection.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Andrei");
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Jame");
        list.add("Abdul");
        list.add("Andrei");


        ArrayList<String> list1 = new ArrayList<>();    // используется для удаления
        list1.add("Michael");
        list1.add("Abdul");
        list1.add("Andrei");

        list.removeAll(list1); // используется для удаления
      //  System.out.println(list);
        System.out.println(list);
    }
}

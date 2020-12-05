package com.galvanize;

import java.util.ArrayList;

public class PrimitivesObjects {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("item1");

        ArrayList<String> list2 = list1;
        list1.add("item2");

        if (args.length == 0) {
            System.out.println("list 2: " + list2);
            System.out.println("Should be true: " + list1.equals(list2));
        } else {
            System.out.println("Should parse the num??? Test: " + Integer.parseInt(args[0]));
        }
    }
}

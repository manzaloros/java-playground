package com.galvanize;

import java.util.ArrayList;

// Hello World app
public class Application {
    private static void passVariable(ArrayList<String> x) {
        x.add("item from inside method");
        System.out.println("Array List inside method: " + x);
    }


    public static void main(String[] args) {
        
        class Person {

        }
        Person person = new Person();
        // Have to instantiate in order to call method, if NOT static
        // Opposite of static? Instance, or non-static

        ArrayList<String> var = new ArrayList<String>();
        passVariable(var);
        var.add("Item from outer scope");
        Object o = new Object();

        System.out.println(o instanceof Person);
    }
}

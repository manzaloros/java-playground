package com.galvanize;

public class Loops {

    static void printEven() {
        for (int i = 2; i < 7; i += 1) {
            if (i % 2 == 0) {
            System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printEven();
    }
}

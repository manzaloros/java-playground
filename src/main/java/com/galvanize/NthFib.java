package com.galvanize;

public class NthFib {
    static int printFib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        return printFib(n - 2) + printFib(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(printFib(8));
    }
}

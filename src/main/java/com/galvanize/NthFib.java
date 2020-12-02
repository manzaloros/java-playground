package com.galvanize;

public class NthFib {
    static int printFib(int prev, int fibNum, int n) {
        if (n == 0) {
            return 0;
        }

        return fibNum + printFib(fibNum, fibNum + prev, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(printFib(1, 1, 3));
    }
}

package com.galvanize;

public class SumOfPositiveNums {
    public void sum(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i += 1) {
            int curr = Integer.parseInt(args[i]);
            if (curr > 0) sum += curr;
        }
        System.out.println(sum);
    }
}

package com.galvanize;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        if (flowerbed[0] == 0 && length == 1) return true;
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n -= 1;
        }

        if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
            flowerbed[length - 1] = 1;
            n -= 1;
        }

        for (int i = 1; i < length - 1; i += 1) {
            if (n <= 0) break;
            if (flowerbed[i] == 0
                    && flowerbed[i - 1] == 0
                    && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n -= 1;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        Solution answer = new Solution();
        System.out.println("Should be true: " + answer.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }
}

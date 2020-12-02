package com.galvanize;

public class Conditionals {
        static boolean isActive(String status) {
            if (status.equals("active")) {
                return true;
            } else {
                return false;
            }
        }

        static String grade(int input) {
            if (input > 89) {
                return "A";
            } else if (input > 79) {
                return "B";
            } else if (input > 69) {
                return "C";
            } else if (input > 59) {
                return "D";
            } else if (input > -1) {
                return "F";
            }
            return "Invalid input";
        }
    public static void main(String[] args) {
        System.out.println("Should be D: " + grade(63));
    }

}

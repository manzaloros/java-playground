package com.galvanize;

public class BankAccount {
    private long balance = 0;

    public BankAccount(long balance) {
        balance = balance;
    }

    public void deposit(long cents) {
        balance += cents;
    }

    public void withdraw(long cents) {
        balance -= cents;
    }

    public long balance() {
        return balance;
    }

    public boolean isOverdrawn() {
        return balance < 0;
    }
}

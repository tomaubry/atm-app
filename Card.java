package com.example.atm;

public class Card {
    private int number;
    private int pin;
    private double balance;

    public Card(int number, int pin, double balance) {
        this.number = number;
        this.pin = pin;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
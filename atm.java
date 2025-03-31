package com.example.atm;

import java.util.Scanner;

public class ATM {
    private Bank bank;
    private Scanner scanner;

    public ATM() {
        this.bank = new Bank();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Insert card (1-3) or enter 0 to exit: ");
            int cardNumber = scanner.nextInt();
            if (cardNumber == 0) {
                exit = true;
                continue;
            }
            Card card = bank.getCard(cardNumber);
            if (card != null) {
                System.out.println("Enter your 4-digit PIN: ");
                int pin = scanner.nextInt();
                if (card.getPin() == pin) {
                    System.out.println("Enter the withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    if (bank.canWithdraw(card, amount)) {
                        bank.updateCardBalance(card, card.getBalance() - amount);
                        dispenseBanknotes(amount);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                } else {
                    System.out.println("Incorrect PIN.");
                }
            } else {
                System.out.println("Invalid card number.");
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    private void dispenseBanknotes(double amount) {
        int[] banknotes = {100, 50, 20, 10, 5, 1};
        System.out.println("Dispensing banknotes:");

        for (int banknote : banknotes) {
            int count = (int) (amount / banknote);
            if (count > 0) {
                System.out.println(count + " x " + banknote + " bills");
                amount -= count * banknote;
            }
        }
    }
}
package com.example.atm;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Card> cards;

    public Bank() {
        cards = new HashMap<>();
        
        cards.put(1, new Card(1, 1234, 1000.0));
        cards.put(2, new Card(2, 2345, 2000.0));
        cards.put(3, new Card(3, 3456, 3000.0));
    }

    public Card getCard(int number) {
        return cards.get(number);
    }

    public boolean canWithdraw(Card card, double amount) {
        return card != null && card.getBalance() >= amount;
    }

    public void updateCardBalance(Card card, double newBalance) {
        if (card != null) {
            card.setBalance(newBalance);
        }
    }
}
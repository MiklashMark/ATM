package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class ATMClient {
   private String cardNumber;
    private String cardPassword;
    private List<ATMClientCard> atmClientCardsList = new ArrayList<>();
    public ATMClient(String cardNumber, String cardPassword) {
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public int getRubleBalance() {
        return rubleBalance;
    }

    public int getPenniesBalance() {
        return penniesBalance;
    }

    public ATMClient() {
    }

    @Override
    public String toString() {
        return "User{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardPassword=" + cardPassword +
                ", rublebBalance=" + rubleBalance +
                ", penniesBalance=" + penniesBalance +
                '}';
    }
}

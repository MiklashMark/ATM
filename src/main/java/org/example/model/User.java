package org.example.model;

public class User {
   private String cardNumber;
    private String cardPassword;

    private int rubleBalance;
    private int penniesBalance;

    public User(String cardNumber, String cardPassword) {
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

    public User() {
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

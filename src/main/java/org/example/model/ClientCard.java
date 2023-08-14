package org.example.model;

public class ClientCard {

    private String cardNumber;
    private String cardPassword;
    private int rublesBalance;
    private int penniesBalance;

    public ClientCard(String cardNumber, String cardPassword) {
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
    }

    public ClientCard(String cardNumber, String cardPassword, int rublesBalance, int penniesBalance) {
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.rublesBalance = rublesBalance;
        this.penniesBalance = penniesBalance;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public int getRublesBalance() {
        return rublesBalance;
    }

    public int getPenniesBalance() {
        return penniesBalance;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }
}

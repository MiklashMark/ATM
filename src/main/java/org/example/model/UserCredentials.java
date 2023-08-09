package org.example.model;

import java.util.Objects;

public class UserCredentials {
    private String cardNumber;
    private String pinCode;

    public UserCredentials(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public UserCredentials(){}

    public UserCredentials(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof User user)) return false;
        return Objects.equals(cardNumber, user.getCardNumber())
                && Objects.equals(pinCode, user.getCardPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pinCode);
    }

    public UserCredentials getCredentials(UserCredentials credentials){return credentials; }

    @Override
    public String toString() {
        return "Credentials{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}

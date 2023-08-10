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

    public UserCredentials getCredentials(UserCredentials credentials){return credentials; }

    @Override
    public String toString() {
        return "Credentials{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}

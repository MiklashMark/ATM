package org.example.model;

public class ATMClientCredentials {
    private String cardNumber;
    private String pinCode;

    public ATMClientCredentials(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public ATMClientCredentials(){}

    public ATMClientCredentials(String cardNumber) {
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

    public ATMClientCredentials getCredentials(ATMClientCredentials credentials){return credentials; }

    @Override
    public String toString() {
        return "Credentials{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}

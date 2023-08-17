package org.example.model;

public class ClientCredentials {
    private String cardNumber;
    private String pinCode;

    public ClientCredentials(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public ClientCredentials(){}

    public ClientCredentials(String cardNumber) {
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

    public ClientCredentials getCredentials(ClientCredentials credentials){return credentials; }

    @Override
    public String toString() {
        return "Credentials{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}

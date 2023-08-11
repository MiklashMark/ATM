package org.example.model;

public class ATMCollectionCredentials {
    private String identificationNumber;
    public ATMCollectionCredentials(){};

    public ATMCollectionCredentials(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }
}

package org.example.model;

public class ATMCollectionCredentials {
    private String identificationNumber;
    private String atmPassword;
    public ATMCollectionCredentials(){};

    public ATMCollectionCredentials(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getAtmPassword() {
        return atmPassword;
    }
}

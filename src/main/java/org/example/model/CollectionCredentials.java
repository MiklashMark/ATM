package org.example.model;

public class CollectionCredentials {
    private String identificationNumber;
    private String atmPassword;
    public CollectionCredentials(){};

    public CollectionCredentials(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getAtmPassword() {
        return atmPassword;
    }
}

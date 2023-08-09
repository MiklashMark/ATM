package org.example.model;

public class Collection {
    private  String password = "CollectionATM";
    private final String identificationNumber;

    public Collection(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

}


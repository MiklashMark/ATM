package org.example.model;

import java.util.Objects;

public class CollectionCredentials {
    private String identificationNumber;
    private final String password = "CollectionATM";

    public CollectionCredentials(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getPassword() {
        return password;
    }
}

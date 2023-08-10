package org.example.model;

import java.util.Objects;

public class CollectionCredentials {
    private String identificationNumber;

    public CollectionCredentials(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }
}

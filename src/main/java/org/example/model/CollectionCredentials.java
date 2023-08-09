package org.example.model;

import java.util.Objects;

public class CollectionCredentials {
    private String identificationNumber;
    private final String password = "CollectionATM";

    public CollectionCredentials(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Collection collection)) return false;
        return Objects.equals(identificationNumber, collection.getIdentificationNumber())
                && Objects.equals(password, collection.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificationNumber, password);
    }
}

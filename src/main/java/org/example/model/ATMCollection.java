package org.example.model;

import java.util.Scanner;

public class ATMCollection {
    private final String identificationNumber = null;

    private Scanner collectionInput = new Scanner(System.in);

    public ATMCollection() {
        this.identificationNumber = identificationNumber;
    }


    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public Scanner getCollectionInput() {
        return collectionInput;
    }
}


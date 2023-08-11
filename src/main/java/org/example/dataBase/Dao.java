package org.example.dataBase;

import org.example.model.ATMCollection;
import org.example.model.ATMClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public  class Dao {
    private List<ATMClient> atmClientList = new ArrayList<>();
    private List<ATMCollection> atmCollectionList = new ArrayList<>();
    private boolean authorizationIndicator = false;
    private final String atmClientDB = "C:\\Users\\markm\\Desktop" +
            "\\javaProjectsHome\\ATM\\src\\main\\java\\org\\example\\dataBase\\atmClientFile";
    private final String collectionDB = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\dataBase\\collectionDao\\collectionFile";
    private BufferedReader bufferedReader = null;
    private BufferedWriter bufferedWriter = null;

    public List<ATMClient> getAtmClientList() {
        return atmClientList;
    }

    public void setAtmClientList(List<ATMClient> atmClientList) {
        this.atmClientList = atmClientList;
    }

    public List<ATMCollection> getAtmCollectionList() {
        return atmCollectionList;
    }

    public void setAtmCollectionList(List<ATMCollection> atmCollectionList) {
        this.atmCollectionList = atmCollectionList;
    }

    public boolean isAuthorizationIndicator() {
        return authorizationIndicator;
    }

    public void setAuthorizationIndicator(boolean authorizationIndicator) {
        this.authorizationIndicator = authorizationIndicator;
    }

    public String getATMClientDB() {
        return atmClientDB;
    }

    public String getCollectionDB() {
        return collectionDB;
    }
}

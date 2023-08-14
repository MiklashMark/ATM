package org.example.dataBase;

import org.example.model.ATMCollection;
import org.example.model.ATMClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public  class Dao {
    private List<ATMClient> atmClients = new ArrayList<>();
    private List<ATMCollection> atmCollections =  new ArrayList<>();

    private final String atmClientDB = "C:\\Users\\markm\\Desktop" +
            "\\javaProjectsHome\\ATM\\src\\main\\java\\org\\example\\dataBase\\atmClientFile";
    private final String collectionDB = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\dataBase\\collectionDao\\collectionFile";

    private BufferedReader bufferedReader = null;
    private BufferedWriter bufferedWriter = null;

    private boolean authorizationIndicator = false;


    public List<ATMClient> getATMClientList() {
        return atmClients;
    }

    public void setATMClientList(List<ATMClient> atmClientList) {
        this.atmClients = atmClientList;
    }

    public List<ATMCollection> getATMCollectionList() {
        return atmCollections;
    }

    public void setATMCollectionList(List<ATMCollection> atmCollectionList) {
        this.atmCollections = atmCollectionList;
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

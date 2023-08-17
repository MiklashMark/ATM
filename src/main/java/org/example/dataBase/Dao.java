package org.example.dataBase;

import org.example.model.Collection;
import org.example.model.Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public  class Dao {
    private List<Client> clients = new ArrayList<>();
    private List<Collection> collections =  new ArrayList<>();

    private final String atmClientDB = "C:\\Users\\markm\\Desktop" +
            "\\javaProjectsHome\\ATM\\src\\main\\java\\org\\example\\dataBase\\atmClientFile";
    private final String collectionDB = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\dataBase\\collectionDao\\collectionFile";

    private BufferedReader bufferedReader = null;
    private BufferedWriter bufferedWriter = null;

    private boolean authorizationIndicator = false;


    public List<Client> getATMClients() {
        return clients;
    }

    public void setATMClients(List<Client> clientList) {
        this.clients = clientList;
    }

    public List<Collection> getATMCollectionList() {
        return collections;
    }

    public void setATMCollectionList(List<Collection> collectionList) {
        this.collections = collectionList;
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

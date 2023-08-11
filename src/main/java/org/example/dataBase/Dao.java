package org.example.dataBase;

import org.example.model.ATMCollection;
import org.example.model.ATMClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class Dao<A, O> {
    protected List<ATMClient> usersList = new ArrayList<>();
    protected List<ATMCollection> collectionList = new ArrayList<>();
    ATMCollection collection;
    protected boolean authorizationIndicator = false;
    protected final String userDB = "C:\\Users\\markm\\Desktop" +
            "\\javaProjectsHome\\ATM\\src\\main\\java\\org\\example\\dataBase\\atmClientFile";
    protected final String collectionDB = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\dataBase\\collectionDao\\collectionFile";
    protected BufferedReader bufferedReader = null;
    protected BufferedWriter bufferedWriter = null;

    public abstract void getAll();

    public abstract void isNotFound();
}

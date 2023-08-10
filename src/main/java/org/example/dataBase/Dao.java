package org.example.dataBase;

import org.example.model.Collection;
import org.example.model.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class Dao<T,V> {
    protected List<User> usersList = new ArrayList<>();
    protected List<Collection> collectionList = new ArrayList<>();
    Collection collection;
    protected boolean authorizationIndicator = false;
    protected final String userDB = "C:\\Users\\markm\\Desktop" +
            "\\javaProjectsHome\\ATM\\src\\main\\java\\org\\example\\dataBase\\usersFile";
    protected final String collectionDB = "C:\\Users\\markm\\Desktop\\javaProjectsHome\\ATM" +
            "\\src\\main\\java\\org\\example\\dataBase\\collectionDao\\collectionFile";
    protected BufferedReader bufferedReader = null;
    protected BufferedWriter bufferedWriter = null;

    public abstract void getAll();

    public abstract void isNotFound();
}

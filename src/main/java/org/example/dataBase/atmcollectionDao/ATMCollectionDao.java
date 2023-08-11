package org.example.dataBase.atmcollectionDao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dataBase.Dao;
import org.example.model.ATMCollection;
import org.example.model.ATMCollectionCredentials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class ATMCollectionDao extends Dao implements IATMCollectionDao {
    @Override
    public void getAll() {
        try(BufferedReader  bufferedReader = new BufferedReader(new FileReader(collectionDB))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<ATMCollection>>(){}.getType();
            collectionList = gson.fromJson(bufferedReader, jsonType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void isNotFound() {
        System.out.println("Invalid Input! Try again.");
    }

    @Override
    public Optional<ATMCollection> getCollection(ATMCollectionCredentials ATMCollectionCredentials) {
        return collectionList.stream().filter(c -> c.getIdentificationNumber().equals(ATMCollectionCredentials.getIdentificationNumber())
                && c).findFirst();
    }
}

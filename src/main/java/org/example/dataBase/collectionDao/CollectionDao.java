package org.example.dataBase.collectionDao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dataBase.Dao;
import org.example.model.Collection;
import org.example.model.CollectionCredentials;
import org.example.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class CollectionDao extends Dao<CollectionCredentials, Collection> {



    @Override
    public Collection get(CollectionCredentials collectionCredentials) {
        Collection collection = null;
        for (Collection c : collectionArrayList) {
            if(collectionCredentials.equals(c)) {
                collection = c;
                break;
            }
        }
        return collection;
    }

    @Override
    public void getAll() {
        try(BufferedReader  bufferedReader = new BufferedReader(new FileReader(collectionDB))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<Collection>>(){}.getType();
            collectionArrayList = gson.fromJson(bufferedReader, jsonType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void isNotFound() {
        System.out.println("Invalid Input! Try again.");
    }
}

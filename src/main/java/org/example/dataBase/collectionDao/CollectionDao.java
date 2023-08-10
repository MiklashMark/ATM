package org.example.dataBase.collectionDao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dataBase.Dao;
import org.example.model.Collection;
import org.example.model.CollectionCredentials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class CollectionDao extends Dao<CollectionCredentials, Optional<Collection>> implements ICollectionDao {
    @Override
    public void getAll() {
        try(BufferedReader  bufferedReader = new BufferedReader(new FileReader(collectionDB))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<Collection>>(){}.getType();
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
    public Optional<Collection> getCollection(CollectionCredentials collectionCredentials) {
        return usersList.stream().filter(u->u.getCardNumber().equals(userCredentials.getCardNumber())
                && u.getCardPassword().equals(userCredentials.getPinCode())).findFirst();
    }
}

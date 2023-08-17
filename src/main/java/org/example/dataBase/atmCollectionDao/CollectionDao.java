package org.example.dataBase.atmCollectionDao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.atm.ATM;
import org.example.dataBase.Dao;
import org.example.model.Client;
import org.example.model.Collection;
import org.example.model.CollectionCredentials;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;
import java.util.logging.XMLFormatter;

public class CollectionDao implements ICollectionDao {
    private Dao dao = new Dao();

    @Override
    public void getAll() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dao.getCollectionDB()))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<Collection>>() {
            }.getType();
            dao.setATMCollectionList(gson.fromJson(bufferedReader, jsonType));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Collection collection) {
        getAll();

        Optional<Collection> foundedCollection = dao.getATMCollectionList().stream()
                .filter(c -> collection.getIdentificationNumber().equals(c.getIdentificationNumber())).findFirst();
        foundedCollection.ifPresent(existingCollection -> dao.getATMCollectionList().set(dao.getATMCollectionList().indexOf(existingCollection), collection));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dao.getCollectionDB()))) {
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            gson.toJson(dao.getATMCollectionList(), bufferedWriter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Collection> getCollection(CollectionCredentials collectionCredentials, ATM atm) {
        getAll();
        return dao.getATMCollectionList().stream().filter(c ->
                c.getIdentificationNumber().equals(collectionCredentials.getIdentificationNumber())
                        && collectionCredentials.getAtmPassword().equals(atm.getPassword())).findFirst();
    }
}

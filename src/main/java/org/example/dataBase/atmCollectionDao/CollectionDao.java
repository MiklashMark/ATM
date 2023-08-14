package org.example.dataBase.atmCollectionDao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.atm.ATM;
import org.example.dataBase.Dao;
import org.example.model.ATMCollection;
import org.example.model.ATMCollectionCredentials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class CollectionDao implements ICollectionDao {
    private Dao dao = new Dao();

    @Override
    public void getAll() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dao.getCollectionDB()))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<ATMCollection>>() {
            }.getType();
            dao.setATMCollectionList(gson.fromJson(bufferedReader, jsonType));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(ATMCollection atmCollection) {

    }

    @Override
    public Optional<ATMCollection> getCollection(ATMCollectionCredentials atmCollectionCredentials,ATM atm) {
        getAll();
        return dao.getATMCollectionList().stream().filter(c ->
                c.getIdentificationNumber().equals(atmCollectionCredentials.getIdentificationNumber())
                        && atmCollectionCredentials.getAtmPassword().equals(atm.getPassword())).findFirst();
    }
}

package org.example.dataBase.atmClientDao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dataBase.Dao;
import org.example.model.ATMClient;
import org.example.model.ATMClientCredentials;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class ATMClientDao implements IATMClientDao {

    private Dao dao = new Dao();
    @Override
    public Optional<ATMClient> getATMClient(ATMClientCredentials ATMClientCredentials) {
        return dao.getAtmClientList().stream().filter(u->u.getATMClientCard().getCardNumber().equals(ATMClientCredentials.getCardNumber())
                && u.getATMClientCard().getCardPassword().equals(ATMClientCredentials.getPinCode())).findFirst();
    }


    @Override
    public void getAll() {
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader(dao.getATMClientDB()))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<ATMClient>>() {
            }.getType();
            dao.setAtmClientList(gson.fromJson(bufferedReader, jsonType));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(ATMClient atmClient) {

    }
}

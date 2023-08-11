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

public class ATMClientDao extends Dao<ATMClientCredentials, Optional<ATMClient>> implements IATMClientDao {


    @Override
    public void update(ATMClient ATMClient) {
        getAll();

        Optional<ATMClient> foundUser = usersList.stream().filter(u -> ATMClient.getCardPassword().equals(u.getCardPassword())
                && ATMClient.getCardNumber().equals(u.getCardNumber())).findFirst();
        foundUser.ifPresent(existingATMClient -> usersList.set(usersList.indexOf(existingATMClient), ATMClient));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userDB))) {
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            gson.toJson(usersList, bufferedWriter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<ATMClient> getUser(ATMClientCredentials ATMClientCredentials) {
        return usersList.stream().filter(u->u.getCardNumber().equals(ATMClientCredentials.getCardNumber())
                && u.getCardPassword().equals(ATMClientCredentials.getPinCode())).findFirst();
    }


    @Override
    public void getAll() {
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader(userDB))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<ATMClient>>() {
            }.getType();
            usersList = gson.fromJson(bufferedReader, jsonType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void isNotFound() {
        System.out.println("Invalid input! Try again.");
    }
}

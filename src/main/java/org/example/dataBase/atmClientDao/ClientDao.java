package org.example.dataBase.atmClientDao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dataBase.Dao;
import org.example.model.Client;
import org.example.model.ClientCredentials;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class ClientDao implements IClientDao {

    private Dao dao = new Dao();
    @Override
    public Optional<Client> getATMClient(ClientCredentials ClientCredentials) {
        return dao.getATMClients().stream().filter(u->u.getATMClientCard().getCardNumber().equals(ClientCredentials.getCardNumber())
                && u.getATMClientCard().getCardPassword().equals(ClientCredentials.getPinCode())).findFirst();
    }


    @Override
    public void getAll() {
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader(dao.getATMClientDB()))) {
            Gson gson = new Gson();
            Type jsonType = new TypeToken<List<Client>>() {
            }.getType();
            dao.setATMClients(gson.fromJson(bufferedReader, jsonType));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Client client) {
        getAll();

        Optional<Client> foundUser = dao.getATMClients().stream()
                .filter(u -> client.getATMClientCard().getCardPassword().equals(u.getATMClientCard().getCardPassword())
                && client.getATMClientCard().getCardNumber().equals(u.getATMClientCard().getCardNumber())).findFirst();
        foundUser.ifPresent(existingUser -> dao.getATMClients().set(dao.getATMClients().indexOf(existingUser), client));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dao.getATMClientDB()))) {
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            gson.toJson(dao.getATMClients(), bufferedWriter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

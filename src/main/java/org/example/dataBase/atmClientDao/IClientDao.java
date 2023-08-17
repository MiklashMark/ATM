package org.example.dataBase.atmClientDao;

import org.example.dataBase.IDao;
import org.example.model.ClientCredentials;
import org.example.model.Client;

import java.util.Optional;

public interface IClientDao extends IDao<Client> {
    void update(Client Client);
    Optional<Client> getATMClient(ClientCredentials ClientCredentials);
}

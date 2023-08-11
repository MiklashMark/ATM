package org.example.dataBase.atmClientDao;

import org.example.model.ATMClientCredentials;
import org.example.model.ATMClient;

import java.io.IOException;
import java.util.Optional;

public interface IATMClientDao {
    void update(ATMClient ATMClient) throws IOException;
    Optional<ATMClient> getUser(ATMClientCredentials ATMClientCredentials);
}

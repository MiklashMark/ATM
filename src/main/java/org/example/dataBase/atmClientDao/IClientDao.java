package org.example.dataBase.atmClientDao;

import org.example.dataBase.IDao;
import org.example.model.ATMClientCredentials;
import org.example.model.ATMClient;

import java.util.Optional;

public interface IClientDao extends IDao<ATMClient> {
    void update(ATMClient ATMClient);
    Optional<ATMClient> getATMClient(ATMClientCredentials ATMClientCredentials);
}

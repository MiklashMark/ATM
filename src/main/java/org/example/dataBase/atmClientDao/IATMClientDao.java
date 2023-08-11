package org.example.dataBase.atmClientDao;

import org.example.dataBase.IATMDao;
import org.example.model.ATMClientCredentials;
import org.example.model.ATMClient;

import java.util.Optional;

public interface IATMClientDao extends IATMDao<ATMClient> {
    void update(ATMClient ATMClient);
    Optional<ATMClient> getATMClient(ATMClientCredentials ATMClientCredentials);
}

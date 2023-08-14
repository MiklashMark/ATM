package org.example.dataBase.atmCollectionDao;

import org.example.atm.ATM;
import org.example.dataBase.IDao;
import org.example.model.ATMCollection;
import org.example.model.ATMCollectionCredentials;

import java.util.Optional;

public interface ICollectionDao extends IDao<ATMCollection> {
    Optional<ATMCollection> getCollection(ATMCollectionCredentials ATMCollectionCredentials, ATM atm);
}

package org.example.dataBase.atmcollectionDao;

import org.example.atm.ATM;
import org.example.dataBase.IATMDao;
import org.example.model.ATMCollection;
import org.example.model.ATMCollectionCredentials;

import java.util.Optional;

public interface IATMCollectionDao extends IATMDao<ATMCollection> {
    Optional<ATMCollection> getCollection(ATMCollectionCredentials ATMCollectionCredentials, ATM atm);
}

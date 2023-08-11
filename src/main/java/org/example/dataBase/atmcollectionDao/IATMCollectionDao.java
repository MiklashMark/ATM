package org.example.dataBase.atmcollectionDao;

import org.example.model.ATMCollection;
import org.example.model.ATMCollectionCredentials;

import java.util.Optional;

public interface IATMCollectionDao {
    Optional<ATMCollection> getCollection(ATMCollectionCredentials ATMCollectionCredentials);
}

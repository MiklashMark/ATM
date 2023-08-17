package org.example.dataBase.atmCollectionDao;

import org.example.atm.ATM;
import org.example.dataBase.IDao;
import org.example.model.Collection;
import org.example.model.CollectionCredentials;

import java.util.Optional;

public interface ICollectionDao extends IDao<Collection> {
    Optional<Collection> getCollection(CollectionCredentials CollectionCredentials, ATM atm);
}

package org.example.dataBase;

import org.example.atm.ATM;
import org.example.model.ATMCollection;
import org.example.model.ATMCollectionCredentials;

import java.util.Optional;

public interface IATMDao<T> {
    void getAll();
    void update(T t);

}
